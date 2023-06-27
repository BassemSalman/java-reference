import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ImportantSorting {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hi", "bye", "why", "ace", "s", "longString");
        
        // multiple ways to sort

        /*
         * Lambda
         */
        strings.sort((str1, str2) -> str1.length() - str2.length());
        System.out.println(strings);

        
        /*
         * Anonymous Comparator implementation
         */
        Collections.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return s2.length() - s1.length();
            }
        });
        System.out.println(strings);
    }


    /*
     * Let our class implement Comparable<Custom> interface
     * @Override
     * public int compareTo(Custom c){
     * this. ...
     * }
     * 
     * then Collections.sort() does the job 
     */


}
