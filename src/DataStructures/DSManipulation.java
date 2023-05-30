package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class DSManipulation {
    public static void main(String[] args) {
        /*
         * Arrays Class
         */
        int[] array = new int[]{1,2,1,24,1,4,1};
        Arrays.sort(array); // in place quick sort
        int index = Arrays.binarySearch(array, 1);

        String[] names = {"test", "hi", "abc"};

        /*
         * Comparator.comparingInt() method is used to create a comparator based on the length of the strings. The String::length
         * method reference is passed as an argument to comparingInt() to extract the length of each string for comparison.
         */
        Arrays.sort(names, Comparator.comparingInt(String::length) /*.reversed()*/); 
        
        // similar to clone
        int[] copy = Arrays.copyOf(array, array.length);

        Arrays.equals(copy, array); // same as .equals of arr
        Arrays.fill(array, 34);


        /*
         * Collections Interface ( usual unordered ..)
         * Collections.sort(Collection)
         * instance:
            int size()
            boolean contains(Object o)
            boolean add(T element)
            boolean remove(Object element)
            isEmpty()

            AND

            .iterator()
         */
        

        /* 
         * Iterator Interface
         * used to traverse any collection (not array)
         * could be used for array due to Arrays.asList(array)
         * asList notice : the resulting list is a fixed-size list backed by the original array
         *      (expects array of objects not primitive)
         * 
         * it.remove() // removes current element (couldnt be used in for( : ))
         * it.next()
         * it.hasNext();
         * 
         * can create custom iterator
         */
        List<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(5);
        Iterator<Integer> iterator = test.iterator();

        while(iterator.hasNext()){
            int e = iterator.next();
            System.out.println(e);
        }




        /*
         * Lambda Expressions
         * (anonymous function)
         * (parameter1, parameter2) -> expression (cant contain if-for-..)
         * can use { } to define block instead
         * 
         * () -> { return smth }
         * 
         * could be stored in Runnable variable ( interface with .run() method only)
         * 
         * 
         * (x, y) -> x + y so it returns the sum of the two parameters
         * () -> System.out.println("test"); no return and no parameters
         * 
         */
        Runnable r = () -> System.out.println("Hello, world!");
        r.run();

        List<String> str = Arrays.asList("John", "Mary", "Peter");
        str.forEach(System.out::println);// (this is executed for all elements as parameter one by one));
    
        // foreach((n) -> { System.out.println(n); }
        test.replaceAll(number->number+2);




        /*
         * Streams
         * 
         * allow to map, filter, etc a collection
         * sorted..
         * 
         filter: select elements due to some condition => boolean
         map: transform elements name->name.length() 
         collect: to accumulate elements in vertain way, ex:Collectors.joining(", "), Collectors.toList()
         
         */
        List<Integer> a = Arrays.asList(1,41,2,412,414,1);
        a.stream()
         .map(n->n*n) //takes lambda ( doesnt edit original )
         .reduce(0, Integer::sum); // reduces stream to single vlaue ( initial value, )
    


        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "durian", "elderberry");

        // Example: Filter and collect only fruits starting with "a" into a new list
        List<String> filteredFruits = fruits.stream()
                .filter(fruit -> fruit.startsWith("a"))
                .collect(Collectors.toList());
    }
}
