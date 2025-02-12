package A20_Recursion;

public class B5_Sorted_Or_Not {
    public static void main(String[] args) {
        int[] a = {3,4,64,67,876,35,24};
        int[] b = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(isSorted(a,0));
        System.out.println(isSorted(b,0));

    }
    public static boolean isSorted(int[] arr,int i){
        if(arr.length-1 ==i){
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr,i+1);

    }
}
