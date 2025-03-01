package A23_ArrayLists;

import java.util.ArrayList;

public class B9_Container_With_Most_Water_Two_Pointers {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        System.out.println(mostWater(list));

    }
    public static int mostWater(ArrayList<Integer> list){
        int start = 0 , end = list.size()-1 , maxWater = 0;

        // Here we are using to pointer approach start and end ;
        while(start<end){
            int minHeight = Math.min(list.get(start), list.get(end));
            int width = end - start;
            maxWater = Math.max(maxWater,minHeight*width);
            if (list.get(start) < list.get(end)) {
                start++;
            }
            else{
                end--;
            }
        }
        return maxWater;
    }
}
