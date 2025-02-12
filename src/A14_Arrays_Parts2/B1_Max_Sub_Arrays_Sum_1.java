package A14_Arrays_Parts2;

import java.util.Scanner;

public class B1_Max_Sub_Arrays_Sum_1 {
    public static void main(String[] args) {
        int[] arr = {24,45,342,34,46,42,64,42,464,24,87,64,434,4,565,424,676,32,467,32,435,24,78};
        max_sub_arrays_sum(arr);
    }
    public static void max_sub_arrays_sum(int[] arr){
        int current_sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j=i; j< arr.length;j++){
                current_sum = 0;
                for (int k = i; k <=j; k++) {
                    current_sum += arr[k];
                }
                System.out.println(current_sum);
                if (max < current_sum) {
                    max = current_sum;
                }
            }
        }
        System.out.println("Max sum : "+max);
    }
}

