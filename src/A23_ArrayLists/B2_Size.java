package A23_ArrayLists;

import java.util.ArrayList;

public class B2_Size {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        int n = list.size();
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
