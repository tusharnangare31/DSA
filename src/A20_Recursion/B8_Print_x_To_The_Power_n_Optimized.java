package A20_Recursion;

public class B8_Print_x_To_The_Power_n_Optimized {
    public static void main(String[] args) {
        System.out.println(optimized(2,10));

    }
    public static int optimized(int x, int n){
        if (n == 0) {
            return 1;
        }
        int halfPower = optimized(x,n/2);
        int halfPowerSquare = halfPower * halfPower;

        //Odd
        if (n%2 != 0) {
            return x * halfPowerSquare;
        }
        return halfPowerSquare;

    }
}
