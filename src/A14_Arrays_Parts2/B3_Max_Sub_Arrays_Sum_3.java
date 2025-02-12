package A14_Arrays_Parts2;

public class B3_Max_Sub_Arrays_Sum_3 {
    public static void main(String[] args) {
        int[] arr ={-2,-3,4,-1,-2,1,5,-3};
        kadanes(arr);
    }
    public static void kadanes(int[] arr){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 1 ; i < arr.length; i++){
            cs = Math.max(arr[i],cs+arr[i]);
            ms = Math.max(cs,ms);
        }
        System.out.println("Max Sub Array Sum "+ms);
    }
}
