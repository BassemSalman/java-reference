package LanguageBasics;

import java.time.LocalDate;
import java.time.LocalDateTime;

// unreffed variable => garbage collector frees them from memory
public class File1Variables {
    String hi; // instance variable
    static double abc; // unified for all class = class variables
    public static void main(String[] args) throws Exception {
        // local variables => of a method
        // refs are local but objs refed are in heap

        // primitive
        int x;
        x=2;
        double z = 2;
        float a = 2;

        // cant change later
        final int cst = 1;
        final Object o = new Object(); // can edit obj but not o

        // non-primitive
        Object object; // ref to object
        int[] arr; // reference to array, util.Arrays class


        //implicit and explicit casting
        double d = x;         // implicit
        int num = (int) 5.12; // explicit
    
        File3Circle c = new File3Circle(1.4, "RED");
        File3Circle c2 = c; // same ref to object, we couldve used clone instead


        int arr2[] = new int[5];
        int arr3[] = new int[]{1,2,30};

    }
}
