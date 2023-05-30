package DataStructures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
/*
 * Set Interface, extends collection
 * No duplicates
 * No ordering, yet allows iteration
 * Provides methods for adding, removing, and checking the presence of elements.
 */
    Set<Integer> set = new HashSet<>();
   
/*
 * HashSet implements Set
 * no ordering
 * depends on hashtable => store and retrieve O(1)
 * Suitable for general-purpose use when order or sorting is not required.
 */
    HashSet<String> hashSet = new HashSet<>();
    hashSet.add("Hello");
    hashSet.add("Apple");

/*
 * TreeSet implements Set
 * Ordering: depending on .equals of objects
 * depends on self-balancing bst
 * Slower than HashSet for basic operations but provides sorted order of elements.
If you need a set that maintains elements in sorted order, use TreeSet.
 */

    TreeSet<String> treeSet = new TreeSet<>();
    treeSet.add("Hello");
    treeSet.add("Apple");  


/*
 * add()
 * remove()
 * contains()
 * size()
 * isEmpty()
 * clear()
 * allAll(Collection)
 * clear()
 * 
 * 
 * iterator() // NEEDED TO ACCESS ELEMENTS
 */
        Iterator<String> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            String e = iterator.next();
            System.out.println(e);
        }
        /*
         * 
         * Set<Integer> set = new TreeSet<>();
            set.add(5);
            set.add(2);
            set.add(8);

         * System.out.println(set.first());     // Output: 2 (smallest element)
            System.out.println(set.last());      // Output: 8 (largest element)
            System.out.println(set.lower(5));    // Output: 2 (element lower than 5)
            System.out.println(set.higher(5));   // Output: 8 (element higher than 5)

         * 
         */
    }
}
