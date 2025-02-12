package A13_Arrays_Part1;

import java.util.Arrays;
import java.util.Scanner;

public class B4_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4,5, 33, 33, 34, 35, 43, 44, 45, 46, 54, 56, 74,75, 79, 324, 657, 5324};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void reverse(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1]= temp;
        }

    }

}
