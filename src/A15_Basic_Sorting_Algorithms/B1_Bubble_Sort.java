package A15_Basic_Sorting_Algorithms;

import java.util.Arrays;

public class B1_Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {44,65,34,23,221,112,2,45,67,34,55,87};
        System.out.println("Sorted array : "+ Arrays.toString(bubble_sort(arr)));
    }
    public static int[] bubble_sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    //Sort
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}

