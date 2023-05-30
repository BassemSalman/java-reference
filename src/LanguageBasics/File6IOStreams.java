package LanguageBasics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class File6IOStreams {
    public static void main(String[] args) {


/*Buffered I/O can improve the performance of reading and writing operations
 by reducing the number of system calls and utilizing internal buffers        */

        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

/* In the above example, we create a BufferedWriter wrapped around a FileWriter 
to write data to a file named "output.txt". The BufferedWriter buffers the data
 and writes it to the file in larger chunks, improving the overall write performance. */

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Hello, World!");
            writer.newLine();
            writer.write("This is a sample line.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
