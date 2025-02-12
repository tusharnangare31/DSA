package A16_2D_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class B1_Creation {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        // Enhanced for loop for array
        for (int[] a: arr) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println(search(arr,5));
    }
    public static boolean search(int[][] arr, int key){
        for (int[] a: arr) {
            for (int b :a){
                if (b == key) {
                    return true;
                }
            }
        }
        return false;
    }
}
