import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapUsage {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("a", 0);
        map.put("abc", -5);
        map.put("xyz", 1);
        System.out.println(new ArrayList<Map.Entry<String,Integer>>(map.entrySet()));
        // sorted based on keys
    }
}

