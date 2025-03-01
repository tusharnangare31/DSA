package A23_ArrayLists;

import java.util.ArrayList;

public class B5_Swap_Two_Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add((int) Math.floor(Math.random()*100+1));
        }
        System.out.println(list);
        swap(list,1,8);
        System.out.println(list);
    }
    public static void swap(ArrayList<Integer> list , int idx1 , int idx2){
         int temp = list.get(idx1);
         list.set(idx1, list.get(idx2));
         list.set(idx2, temp);
    }

}
