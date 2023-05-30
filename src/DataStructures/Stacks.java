package DataStructures;

import java.util.Stack;

public class Stacks{
    public static void main(String[] args) {
/*
 * LIFO
 * Stack extends Vector (legacy)
 * Stack() creates empty stack
 * push(E item), pop(), peek(), empty(), search(Object o)
 *
 * Deque ( has Stack operations ) interface such as
 * LinkedList or ArrayDeque for stack operations instead
 * 
 * Vector is relatively inefficient wrt ArrayList/LinkedList
 * 
 */ 
    Stack<String> s = new Stack<>();
    s.push("Hi");
    s.push("Bye");
    String top = s.peek();
    

    /*
     * 
     * Can use push, pop, peek, isEmpty()
     * on LinkedList / ArrayDeque due to Deque interface
     * 
     * ArrayDeque depends resizable array
     * When you need a double-ended queue and efficient insertion/removal at both ends (front and back).
     * When you need to implement a stack, queue, or deque data structure.
     * When random access by index is required, but efficiency is not a critical concern.
     * When you don't require efficient insertion/removal at arbitrary positions.
     * 
     * better than LL as stack
     * less memory
     * can access specific index as well
     * insert middle is complex
     */


    /*
     * Vector
     * Thread safe => no 2 threads can edit in same time => synchronization overhead
     * Slower insertion/retrieval ..
     * Dynamic resizing strategy (usual)
     * 
     * 
     */
    }
}