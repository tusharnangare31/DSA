package A13_Arrays_Part1;

import java.util.Scanner;

public class B6_Sub_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {24,45,342,34,46,42,64,42,464,24,87,64,434,4,565,424,676,32,467,32,435,24,78};
        sub_array(arr);
    }
    public static void sub_array(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
