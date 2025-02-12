package A20_Recursion;

public class B7_Last_Occurrence {
    public static void main(String[] args) {
        int[] arr = {345,4,3,42,64,65,34,3,4,3,5,3,4656,464,64,33,5};
        System.out.println(lastOccurrence(arr,3, arr.length-1));
    }
    public static int lastOccurrence(int[] arr,int key , int index){
        if (index == -1) {
            return index;
        }
        if (arr[index] == key) {
            return index;
        }
        return lastOccurrence(arr, key, index-1);
    }
}
