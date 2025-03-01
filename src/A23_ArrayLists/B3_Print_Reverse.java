package A23_ArrayLists;

import java.util.ArrayList;

public class B3_Print_Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        // Print Reverse
        int n = list.size();
        for (int i = n-1; i >= 0 ; i--) {
            System.out.print(list.get(i)+" ");
        }
    }
}
