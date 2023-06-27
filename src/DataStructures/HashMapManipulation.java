import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMapManipulation {
    public static void main(String[] args) {
        HashMap<Book, Integer> books = new HashMap<>();

        // considered equal in case of equal ids
        books.putIfAbsent(new Book("Book 1", 1), 1);
        books.putIfAbsent(new Book("Book 10", 1), 10);
        System.out.println(books.entrySet());

        books.putIfAbsent(new Book("Book 11", 123), 12);

/*
 * public interface Map<K, V> {
    // Other methods...
  
    interface Entry<K, V> {
        K getKey();
        V getValue();
        V setValue(V value);
      
        // Additional methods...
    }
}
 */
    // entrySet returns set of map entries, ArrayList constructor can accept set
        ArrayList<Map.Entry<Book, Integer>> listOfBooks = new ArrayList<>(books.entrySet());
        System.out.println(listOfBooks);
        Collections.sort(listOfBooks, new Comparator<>(){
            @Override 
            public int compare(Map.Entry<Book, Integer> entry1, Map.Entry<Book, Integer> entry2){
                return entry1.getKey().name.compareTo(entry2.getKey().name);
            }
        });
    }

    
}
