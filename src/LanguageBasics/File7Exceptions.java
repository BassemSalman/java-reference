package LanguageBasics;

import java.io.FileInputStream;
import java.io.IOException;

public class File7Exceptions{

    public static void main(String[] args) {
/* checked exception => must be explicitly handled,  generally related to external factors,
 such as I/O operations or database connectivity.  SQLException / Io ..*/
    try {
        FileInputStream file = new FileInputStream("example.txt");
    } catch (IOException e) {
        System.out.println("An error occurred while opening the file: " + e.getMessage());
    }


/*unchecked occur on runtime, so cant rly expect them 
They occur at runtime and are usually caused by programming errors, 
such as null pointer dereference or arithmetic division by zero
 */

//you can create your own unchecked exception by extending the RuntimeException
/*
 * public class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message) {
        super(message);
    }
}
 */

        int[] numbers = {1, 2, 3};
        System.out.println(numbers[4]); // Throws ArrayIndexOutOfBoundsException

    }    
}