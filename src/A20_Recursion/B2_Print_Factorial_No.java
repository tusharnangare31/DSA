package A20_Recursion;

public class B2_Print_Factorial_No {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }

        return n * factorial(n - 1);
    }

}
