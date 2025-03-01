package A23_ArrayLists;

import java.util.ArrayList;

public class B11_Two_Sum_Sorted_Rotated {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr =  {11,15,6,8,9,10};
        for (int num : arr){
            list.add(num);
        }
        System.out.println(pairSum2(list,16));

    }
    public static boolean pairSum2(ArrayList<Integer> list , int target){
        int bp = -1;
        int n = list.size();
        // Step 1: Find the breakpoint where array rotation happens
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }
        int lp = bp + 1; // Smallest element
        int rp = bp; // Largest Element

        while(lp!=rp){
            // case1
            if (list.get(lp)+ list.get(rp) == target){
                return true;
            }
            else if(list.get(lp)+ list.get(rp) < target) {
                lp =(lp+1)%n;
            }
            else{
                rp= (n+rp-1)%n;
            }
        }
        return false;
    }
}
