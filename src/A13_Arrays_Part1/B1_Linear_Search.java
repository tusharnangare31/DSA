package A13_Arrays_Part1;

import java.util.Scanner;

public class B1_Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {34,54,5,34,5,35,3,34,5,53,6,7,6};
        int key = 10;
        System.out.println(binary_search(arr,key));

    }
    public static int binary_search(int[] arr,int key){
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
