package A20_Recursion;

public class B6_First_Occurrence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,5,3,34,3};
        System.out.println(first_Occurrence(arr,0,3));

    }
    public static int first_Occurrence(int[] arr, int index , int key){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == key) {
            return index;
        }
        return first_Occurrence(arr, index+1, key);

    }
}
