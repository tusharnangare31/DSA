package A14_Arrays_Parts2;

public class B4_Max_Negative_Sub {
    public static void main(String[] args) {
        int[] arr = {-3,-4,-3,-7,-6,-2,-1};
        max_negative(arr);

    }
    public static void max_negative(int[] arr){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < arr.length; i++) {
            cs= Math.max(arr[i],cs+arr[i] );
            ms = Math.max(cs,ms);
        }
        System.out.println("Max sum of sub array :"+ms);


    }
}
