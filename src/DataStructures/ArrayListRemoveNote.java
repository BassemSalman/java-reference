import java.util.ArrayList;

public class ArrayListRemoveNote {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        int removedElement = list.remove(1); // removes at index 1, throws IndexOutOfBounds
        boolean removedFlag = list.remove((Integer)1); // removes object 1
        System.out.println(list );
    }
}
