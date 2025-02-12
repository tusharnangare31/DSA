package A15_Basic_Sorting_Algorithms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class B4_Inbuilt_Sort {
    public static void main(String[] args) {
        // We should want to do this int => Integer to use it in reverse order
        Integer[] arr = {34,65,4,34,24,5,68,42,46,456,6,23,567,25,762,3,5,76,82,35,26,7,7558,8,56};
//        Arrays.sort(arr); // Sort the array in one Line
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,0,5); // Sort the array in defined range
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder()); // Sort in reverse Order
        System.out.println(Arrays.toString(arr));


    }
}
