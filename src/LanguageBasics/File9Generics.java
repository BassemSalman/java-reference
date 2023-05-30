package LanguageBasics;


// it becomes reusable for diff classes
public class File9Generics {
    // T data;
    // int code;

    public static <X> void swap(X[] array, int i, int j) {
        X temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

/*
 * 
 * Integer[] numbers = {1, 2, 3};
File9Generics.swap(numbers, 0, 2);

String[] names = {"Alice", "Bob", "Charlie"};
File9Generics.swap(names, 1, 2);
 */
}

/*
 * Generics are generated in instance NOT class level => cant reference it in static method
 * 
 */