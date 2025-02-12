package A14_Arrays_Parts2;

import java.util.Scanner;

public class B2_Max_Sub_Arrays_Sum_2 {
    public static void main(String[] args) {
        int[] arr = {24,45,342,34,46,42,64,42,464,24,87,64,434,4,565,424,676,32,467,32,435,24,78};
        max_sub_arrays_sum(arr);
    }
    // Using Prefix Array
    public static void max_sub_arrays_sum(int[] arr){
        int current_sum = 0;
        int max = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1]+arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j=i; j< arr.length;j++){
                current_sum = i==0 ? prefix[j]:prefix[j]-prefix[i-1];
                if (max < current_sum) {
                    max = current_sum;
                }
            }
        }
        System.out.println("Max sum : "+max);
    }
}

