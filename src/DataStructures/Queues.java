package DataStructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        /*
         * Queue Interface
         * FIFO
         * 
         * add(E)
         * remove()
         * poll() = peek + remove
         * peek()
         * 
         * offer() returns false if full
         * 
         * implementations are 
         * ArrayDeque or LinkedList
         */

        Queue<String> q = new LinkedList<String>();
        

        /* Deque (Double Ended Queue) Interface
         * Insertion & Removal at both ends
         * 
         * addFirst(e), addLast(e)
         * removeFirst(), removeLast()
         * peekFirst(), peekLast()
         * isEmpty()
         * 
         * implementations such as
         * ArrayDeque or LinkedList
         */
        Deque<String> d = new ArrayDeque<String>();


        /*
         * Priority Queue
         * 
         * (TreeSet is always sorted, this is the diff)
         * 
         * Highest Priority => Always in Front
         * based on heap
         * 
         * O(logn)
         * add(e)
         * remove()
         * peek()
         * isEmpty()
         * 
         * In summary, TreeSet is ideal when you need a collection that maintains elements in a sorted order at all times, 
         * allowing efficient search and retrieval operations. On the other hand, PriorityQueue is suitable when you require priority-based 
         * ordering and need efficient insertion and removal of the highest priority element, without necessarily maintaining a fully sorted order of all elements.
         */
    }
}