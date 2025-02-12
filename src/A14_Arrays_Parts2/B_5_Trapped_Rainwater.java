package A14_Arrays_Parts2;

public class B_5_Trapped_Rainwater {
    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5};
        System.out.println("Trapped Water : "+trapped_water(height));

    }
    public static int trapped_water(int[] arr){
        int n = arr.length;
        // Calculate left max boundary - Array
        int[] leftMax = new int[n];
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i-1],arr[i] );
        }

        // Calculate right max boundary - Array
        int[] rightMax = new int[n];
        rightMax[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1],arr[i]);
        }

        // Loop
        int trapped_water = 0;
        for (int i = 0; i < n; i++) {
            int water_level = Math.min(leftMax[i],rightMax[i]);
            trapped_water += water_level - arr[i];
        }
        return trapped_water;
    }
}
