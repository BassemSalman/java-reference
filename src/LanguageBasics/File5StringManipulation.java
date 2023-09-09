package LanguageBasics;

public class File5StringManipulation {
    public static void main(String[] args) {        
        String str; // null
        str = "Hello"; // initialized
        str += " there"; // since immutable, a new string will be created => complex

        // if str is found, ref the same str
        // else create new string or if constructor is used as well


        String x = str.substring(1, 3); // endIndex not included
        x = str.toUpperCase();
        x = str.toLowerCase();
        String strings[] = str.split(" "); // [Hello, World]
        char c = str.charAt(1);

        int index  = str.indexOf('a'); // first     
        int index2 = str.lastIndexOf('a'); // first


        String replaced = str.replace("World", "Java");  // All Occ


        str.concat("hi"); // or +=
        str.length(); // O(1)



        StringBuilder sb = new StringBuilder(); // char array initially of size 16
        sb.append(str);
        sb.insert(2, "hi");

        // delete/insert => shift
        sb.delete(1,2); 
        sb.deleteCharAt(1);
        String s = sb.toString();
    }
}
