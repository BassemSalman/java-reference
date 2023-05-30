package DataStructures;

import java.util.ArrayList;
import java.util.List;

public class Lists{
    public static void main(String[] args) {
/*
List Interface => Extends Collection:
    add(), get(), remove(), size(), contains()...
    ordered
 */        
    List<String> list = new ArrayList<>();

/*
 * ArrayList implements List
 * internally uses array to store => random access is fast
 * insertion in middle is complex though
 * ArrayList is suitable when you need frequent access to elements and the list size doesn't change frequently
 * insertion at end => O(1)
 * 
 * Initially of size 10
 * However, if you have knowledge about the expected number of elements in advance, providing an initial capacity that is close to the expected size can help optimize the performance by minimizing the number of resize operations
 * /


/*
 * LinkedList implements List, Deque
 * internally uses doubly linked list => random access needs loop
 * efficient insertion and deletion at both sides 
 * LinkedList is suitable when you frequently modify the list (insertions/deletions) or need to perform operations at the beginning or end of the list.
 */

    // Removing an element by value
    boolean removed = list.remove("Banana");
    // Removing an element by index
    String removedElement = list.remove(1);

    }
}