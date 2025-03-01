package A23_ArrayLists;

import java.util.ArrayList;

public class B4_Max {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(35);
        list.add(24);
        list.add(654);
        list.add(23);
        list.add(65);

        int max = Integer.MIN_VALUE;
        for (Integer i : list) {
            max = Math.max(max,i);
        }
        System.out.println(max);
    }
}
