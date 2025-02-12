package A13_Arrays_Part1;

import java.util.Scanner;

public class B5_Pairs_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {4,5, 33, 33, 34, 35, 43, 44, 45, 46, 54, 56, 74,75, 79, 324, 657, 5324};
        pair(arr);
    }
    public static void pair(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+arr[i]+','+arr[j]+')'+" ");
            }
            System.out.println();

        }
    }

}
