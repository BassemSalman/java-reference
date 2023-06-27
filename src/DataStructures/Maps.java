package DataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
/*
    Map Interface
    Key, Value storage
    efficient retrieval of values based on keys
    no 2 elements have same key
 */   

    Map<String, String> map = new HashMap<>();


/*
 *  HashMap implements Map
 *  Depends on hash table
 *  no ordering maintenance
 *  Allows null keys and values
 *  O(1) operations

    hashcode(key) -> index
    if collision => refer to next
 */
    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.put("Apple", "Fruit");
    hashMap.put("Strawberry", "Fruit");


/*
 * TreeMap implements Map
 * Depends on Self Balancing Tree (Red Black)
 * Sorted based on keys
 * Slower than HashMap for basic operations, yet sorted order of entries O(nlogn)
 * no null keys but null values
 */
    TreeMap<String, String> treeMap = new TreeMap<>();
    treeMap.put("Apple", "Fruit");
    treeMap.put("Strawberry", "Fruit");

/*
 * If you need a map with fast basic operations and do not require a specific order of entries, use HashMap.
 * If you need a map that maintains entries in sorted order based on keys, use TreeMap * 
 */


/*
 * Common Methods
 * put(key,value)
 * get(key)
 * containsKey(k)
 * containsValue(v)
 * remove(key)
 * size()
 * isEmpty()
 * clear()
 * 
 * TreeMap Methods:
 * firstKey() // since ordered
    lastKey()
    lowerKey(key) // greatest key strictly lower than key
    subMap(fromKey, toKey)
 */



    }
}
