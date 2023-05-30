package DataStructures;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;



public class Trees<T extends Comparable<T>> {
    /*
     * Tree is a graph with no cycles
     * 
     * Binary Tree is a Tree where each node has 
     * 2 children by maximum
     * 
     * Binary Search Tree is a Binary Tree where
     * for all nodes, left<current<right
     * 
     * inorder on BST produces sorted list of data 
     */

    Node<T> root;
    private static class Node<T extends Comparable<T>> {
        Node<T> left, right; // could be List of children if graph
        T data;
        public Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }



    private void addRightChild(Node<T> node, T data){
        Node<T> n = node.right;
        Node<T> newNode = new Node<>(data);
        newNode.right = n;
        node.right = newNode;
    }

    private void inorder(Node<T> node){
        if(node == null) return;
        inorder(node.left);
        System.out.println(node.data);
        inorder(node.right);
    }

    private void postorder(Node<T> node){
        if(node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data);
    }

    private void preorder(Node<T> node){
        if(node == null) return;
        System.out.println(node.data);
        preorder(node.left);
        preorder(node.right);
    }


    public void levelOrder() {
        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);
        Node<T> node;
        while(!queue.isEmpty()){
            node = queue.remove();
            System.out.println(node.data);
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
    }

    /*
     * visit left subtree then root then right subtree (For All Nodes)
     * So go left until null is encountered, then visit the top
     * then attempt to go right where a right subtree must be visited after root
     * 
     */
    private void InOrderIterative() {
        Deque<Node<T>> stack = new ArrayDeque<>();
        Node<T> current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.print(current.data + " ");
            current = current.right; // could be null => pop next top element
        }
    }

    /*
    * visit root then left then right subtrees for all nodes
    * so visit stack top, then insert right and left children if found (right before left since LIFO)
    */
    private void PreOrderIterative() {
        Deque<Node<T>> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node<T> current = stack.pop();
            System.out.print(current.data + " ");

            if (current.right != null)
                stack.push(current.right);
            if (current.left != null)
                stack.push(current.left);
        }
    }

/*
 * visit left then right subtrees before visiting root for all nodes
 * go as left as possible, visit top if right is visited / null, otherwise visit right
 * 
 */
    private void PostOrderIterative() {
        Deque<Node<T>> stack = new ArrayDeque<>();
        Node<T> current = root;
        Node<T> prev = null;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            Node<T> top = stack.peek();
            if (top.right == null || top.right == prev) {
                stack.pop();
                System.out.print(top.data + " ");
                prev = top;
            } else {
                current = top.right;
            }
        }
    }


    private void binaryInsert(Node<T> n, T data){
        if(n == null) return;

        int c = (n.data).compareTo(data);
        if(c >= 0){
            if(n.right == null) {
                n.right = new Node<>(data);
                return;
            }
            binaryInsert(n.right, data);
        }
        else if(c > 0){
            if(n.left == null) {
                n.left = new Node<>(data);
                return;
            }
            binaryInsert(n.left, data);
        }
    }

    private int numberOfLeaves(Node<T> n) {
        if(n == null) return 0;
        if(n.left == null && n.right == null) return 1;
        return numberOfLeaves(n.left) + numberOfLeaves(n.right);
    }

    private boolean isFullBinaryTree(Node<T> n) {
        if(n == null) return true;
        if(n.left == null && n.right != null) return false;
        if(n.right == null && n.left != null) return false;
        return isFullBinaryTree(n.left) && isFullBinaryTree(n.right);
    }

    private boolean treeSearch(Node<T> n, T data) {
        if(n == null) return false;
        if(n.data.equals(data)) return true;
        return treeSearch(n.left, data) || treeSearch(n.right, data);
    }

    private boolean binarySearch(Node<T> n, T data) {
        if(n == null) return false;
        int c = (n.data).compareTo(data);
        if(c == 0) return true;
        if(c > 0) return binarySearch(n.left, data);
        return binarySearch(n.right, data);
    }

    private Node<T> buildHelper(T[] inputs, int start, int end) {
        if(start > end) return null;
        int mid = (start+end)/2;
        Node<T> node = new Node<>(inputs[mid]);
        node.left = buildHelper(inputs, start, mid - 1);
        node.right = buildHelper(inputs, mid + 1, end);
        return node; // mid of main array inputs
    }
    private Trees<T> build(T[] inputs){
        Trees<T> t = new Trees<>();
        t.root = buildHelper(inputs, 0, inputs.length-1);
        return t;
    }



    public Node<T> buildTree(int height) {
        if (height <= 0)
            return null;

        Node<T> root = new Node(height);
        root.left = buildTree(height - 1);
        root.right = buildTree(height - 1);

        return root;
    }

    public Trees<T> buildTreeMain(int height) {
        Trees<T> tree = new Trees<>();
        tree.root = buildTree(height);
        return tree;
    }

/*
 * compare root to children for all nodes
 */
    boolean isBST(Node<T> tree)
    {
        if(tree == null)
            return true;

        if(tree.left != null && tree.left.data.compareTo(tree.data) > 0)
            return false;

        if(tree.right != null && tree.right.data.compareTo(tree.data) < 0)
            return false;

        return isBST(tree.left) && isBST(tree.right);
    }   

/*
 * isBST using inorder traversal
 */
    boolean isBSTInorder()
    {
        boolean proceed = true;
        Node<T> current = root;
        Deque<Node<T>> stack = new ArrayDeque<>();        
        ArrayList<Node<T>> queue = new ArrayList<>();
        while(proceed){
            while(current != null){
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            queue.add(current);
            current = current.right;
        }
        int size = queue.size();
        for(int i = 0; i<size-1; i++){
            if(queue.get(i).data.compareTo(queue.get(i+1).data) > 0) return false;
        }
        return true;
    }       
}
