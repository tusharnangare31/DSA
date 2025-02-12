package A15_Basic_Sorting_Algorithms;

import java.util.Arrays;

public class P1_Bubble_Sort_Dec{
    public static void main(String[] args) {
        int[] arr = {4,2,0,6,3,2,5};
        bubbleDec(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubbleDec(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] < arr[j+1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
