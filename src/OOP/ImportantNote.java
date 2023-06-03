package OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class ImportantNote{

    /*
    Note 1:
        The position of an object inside a hashmap depends on its hashcode

        You can create a custom hash function depending on your requirements
    */

    private static class X implements Comparable<X>{
        private int id;
        private String s;

        public X(int id, String s){
            this.id=id;
            this.s=s;
        }
// In case we wanted to let X be identified by its id (inside a map), then we should override hashCode method of X
        @Override
        public int hashCode(){
            return Integer.hashCode(id); // thus hashCode of X is the hashCode of its id
        }

// this > X if: this.id > x.id OR (this.id==x.id and this.s > x.s) 
        @Override 
        public int compareTo(X x){
            if(x.id == this.id){
                return s.compareTo(x.s);  // returns 0 if equal, 1 if this.s>x.s, -1 elsewise
            }
            return Integer.compare(this.id, x.id);
        }
    }


    // Note 2:
    /*
     * Any Sorting method depends on the compareTo method of the elements in array 
     * => sorting list of custom class <=> class implements Comparable
     * 
     * The elements should be mutually comparable
     * => [String, int] cannot be sorted, unless custom comparator object was created
     * 
     */

    public static void main(String[] args) {

        // note 1
        HashMap<X, Integer> map = new HashMap<>();
        X test1 = new X(1,"a");
        X test2 = new X(1,"b");
        X test3 = new X(5,"c");

        map.putIfAbsent(test1, 1);
        map.putIfAbsent(test2, 10); 

        // hashmap contents: [test1] only! since id of test1 and test2 are equal
        
        map.put(test2, 10); // this would override test since key exists
        // => map : [test2]


        // note 2
        List<X> list = new ArrayList<>();
        list.add(test2);
        list.add(test3);
        list.add(test1);

        // list contents: [test2, test3, test1]
        Collections.sort(list); // sorts based on custom compareTo, id increasing and s increasing

        // list contents: [test1, test2, test3]


// Extra:

        //  To compare different data types:
                 
        Comparator<Object> comparator = new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String && o2 instanceof String) {
                    // Both objects are strings, compare them lexicographically
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return s1.compareTo(s2);
                } else if (o1 instanceof Integer && o2 instanceof Integer) {
                    // Both objects are integers, compare them numerically
                    Integer i1 = (Integer) o1;
                    Integer i2 = (Integer) o2;
                    return i1.compareTo(i2);
                } else {
                    // Different types, treat the String as less than the Integer
                    return o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
                }
            }
        };

        List<Object> objects = new ArrayList<>();
        objects.add(new String("hi"));
        objects.add(1);
        objects.add(3);
        objects.add(new String("bye"));

        Collections.sort(objects, comparator); // sorts based on custom comparator


        
    // sort strings based on length
        List<String> strings = new ArrayList<>();
        strings.add("hi");
        strings.add("test");
        strings.add("test2");
        strings.add("bye");
        
        Collections.sort(strings, Comparator.comparingInt(String::length));
        
    }




}
