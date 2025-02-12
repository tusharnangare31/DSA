package A13_Arrays_Part1;

import java.util.Scanner;

public class B3_Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int[] arr = {4,5, 33, 33, 34, 35, 43, 44, 45, 46, 54, 56, 74,75, 79, 324, 657, 5324};
        System.out.println( binary_search(arr,key,0,arr.length));
    }
    public static boolean binary_search(int[] arr,int key,int start,int end){
        if (start > end) {
            return false;
        }
        int mid = (start+end)/2;
        if (arr[mid] == key) {
            return true;
        }
        if (arr[mid] < key) {
            return binary_search(arr,key,mid+1,end);
        }
        else {
            return binary_search(arr, key, start, mid-1);
        }

    }
}
