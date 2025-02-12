package A20_Recursion;

public class B3_Sum_Of_n_Number {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));


    }
    public static int sum(int n){
        if (n == 0) {
            return 0;
        }
        return n + sum(n-1);
    }
}
