package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ArraysAndCollections {
    public static void main(String[] args) {
/*
Collections:
No Ordering !! extensions order it
Duplicates
Equality depends on .equals of each type

List, Set, and Queue = SubInterfaces
ArrayList, LinkedList, HashSet = Implementations

int size()
boolean contains(Object o)
boolean add(T element)
boolean remove(Object element)
isEmpty()
Collections.sort(collection)
 
 */
        Collection<String> c = new ArrayList<>();

        int[] arr = {1,2,3}; 
        int len = arr.length;
        Arrays.sort(arr); // quicksort
        
        int[] source = {1, 2, 3};
        int[] destination = new int[source.length];

        System.arraycopy(source, 0, destination, 0, source.length);
        // or
        int[] copy = Arrays.copyOf(source, source.length);

        boolean eq = Arrays.equals(source,destination);

        //Inline initialization: int[] numbers = {1, 2, 3};
        //Initializing with a specified size: int[] numbers = new int[5];
        //Initializing with default values: boolean[] flags = new boolean[10];
         // All elements will be initialized to false

    }
}


/*
 * In summary, Arrays are fixed-size, lower-level data structures with direct language support, while Collections are dynamic,
 *  higher-level data structures with a richer set of operations and algorithms
 * . Collections offer flexibility, type safety, and a more extensive range of functionality for working with groups of elements.
 * 
 * 
 */