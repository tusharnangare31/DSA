package A23_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class B8_Container_With_Most_Water_Brute_Force {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(mostWater(list));

    }
    public static int mostWater(ArrayList<Integer> list){
        int maxWater = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                int minHeight = Math.min(list.get(i), list.get(j) );
                int width = j-i;
                maxWater = Math.max(maxWater,width*minHeight);
            }
        }
        return maxWater;
    }
}
