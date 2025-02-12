package A15_Basic_Sorting_Algorithms;

import java.util.Arrays;

public class B3_Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public  static  void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //Insertion
            arr[prev+1] = curr;
        }
    }
}
