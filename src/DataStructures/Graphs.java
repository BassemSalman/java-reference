package DataStructures;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graphs {
    /*
        set of nodes joined by set of edges 
        K(n) C(n) L(n) ...
        
        - Digraph => edge has direction
        - Undirected => bidirectional edges
        - Acyclic => no cycles => can do dfs/bfs
        - DAG => directed acyclic => can do topological sort where a->b <=> a is before b in sort result
        memory representation: Adjacency List most of the times (other than edgelist, adjacency matrix ..)

        ArrayList<smth> since we need .get(int index) to be efficient
        <smth> is LinkedList since we need to insert neighbors without resizing arraylist

        V   N(V)
        a    b,c
        b    a
        c    a
        d    e
        e    d
    */

    private int vertices;
    private List<List<Integer>> adjList;
    public Graphs(int vertices){
        this.vertices = vertices;
        adjList = new ArrayList<>(vertices);
        for(int i = 0; i<vertices; i++) {
            adjList.add(new LinkedList<>()); // <> since already defined Integer
        }
    }

    public void addEdge(int source, int destination) {
        if(source >= vertices || destination >= vertices)
        adjList.get(source).add(destination); // adding to LinkedList
    }

    public List<Integer> getNeighbors(int vertex){
        return adjList.get(vertex);
    }

    // traversals

    // clear
    public void dfsRecursive(int root, boolean[] visited){
        if(visited == null) visited = new boolean[vertices];
        visited[root] = true;
        System.out.println(root + " ");

        List<Integer> neighbors = adjList.get(root);
        for(int neighbor : neighbors) {
            if(!visited[neighbor])
                dfsRecursive(neighbor, visited);
        }
    }   

    // stack since we want to focus on the depth
    public void dfsIterative(int root) {
        boolean[] visited = new boolean[vertices];
        Deque<Integer> stack = new ArrayDeque<>();

        visited[root] = true;
        stack.push(root);

        while(!stack.isEmpty()){
            int vertex =  stack.pop();
            System.out.println(vertex + " "); // print when u pop

            // explore neighbors, insert them into stack
            List<Integer> neighbors = adjList.get(vertex);
            for (int neighbor : neighbors) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true; // assign visit here so its not inserted again
                    stack.push(neighbor);
                }
            }
        }
    }


    public void bfs(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int vertex = queue.remove();
            System.out.print(vertex + " ");

            // explore neighbors
            List<Integer> neighbors = adjList.get(vertex);
            for (int neighbor : neighbors) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    // only if Directed Acyclic
    public void topologicalSort(int root) {
        Deque<Integer> stack = new LinkedList<>();
        boolean[] visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                // in case of multiple connected components we need a loop / node of outdegree = 0
                topologicalSortUtil(i, visited, stack);
            }
        }

        System.out.print("Topological Sort: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

// recursive dfs but stores the visited nodes in reverse order in a stack, when emptied its in correct order
    private void topologicalSortUtil(int vertex, boolean[] visited, Deque<Integer> stack) {
        visited[vertex] = true;

        List<Integer> neighbors = adjList.get(vertex);
        for (int neighbor : neighbors) {
            if (!visited[neighbor]) {
                topologicalSortUtil(neighbor, visited, stack);
            }
        }

        stack.push(vertex);
    }



    public static void main(String[] args) {
        Graphs g = new Graphs(5);
        g.addEdge(1, 2);
        g.addEdge(2, 1);
        g.addEdge(4, 3);
        g.addEdge(0, 3);

        List<Integer> neighbors = g.getNeighbors(1); // list since we may want to change implementation later

    }
}
