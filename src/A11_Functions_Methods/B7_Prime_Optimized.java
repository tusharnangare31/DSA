package A11_Functions_Methods;

import java.util.Scanner;

public class B7_Prime_Optimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        System.out.println(isPrime(n)?"Prime Number":"Not Prime Number");
    }
    public static boolean isPrime(int n){
        boolean isPrime = true;
        if (n==2){
            return isPrime;
        }
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n%i==0){
                    isPrime = false;
                    return isPrime;
                }
            }
        }
        return isPrime;
    }
}
