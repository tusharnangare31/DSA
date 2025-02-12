package A13_Arrays_Part1;

import java.util.Scanner;

public class B2_Largest_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {53,5,5,67,5,34,24,35,23,556,7,5,557,575,34,32,642,54};
        System.out.println(Max(arr));
    }
    public static int Max(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}

