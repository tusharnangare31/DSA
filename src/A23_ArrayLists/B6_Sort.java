package A23_ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class B6_Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) Math.floor(Math.random()*100+1));
        }
        System.out.print("List before Sorting : ");
        System.out.println(list);
        // Collections.sort() method can do directly sort Arraylist
        Collections.sort(list);
        System.out.print("List After Sorting  : ");
        System.out.println(list);
    }
}
