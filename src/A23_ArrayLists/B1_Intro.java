package A23_ArrayLists;

import java.util.ArrayList;

public class B1_Intro {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> strList = new ArrayList<>();
        ArrayList<Double> doubleList  = new ArrayList<>();
        ArrayList<Float> floatList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        list.add(1,23);

        System.out.println(list);

        // Get Operators
        System.out.println(list.get(2)); // O(1)


        // Remove Operator -O(n)
        list.remove(2);
        System.out.println(list);

        // Set Element at Index -O(n)
        list.set(2,12);
        System.out.println(list);

        // Contains Element
        System.out.println(list.contains(13));
    }
}
