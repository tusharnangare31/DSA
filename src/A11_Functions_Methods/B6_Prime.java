package A11_Functions_Methods;

import java.util.Scanner;

public class B6_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = isPrime(n);
        System.out.println(isPrime?"Prime":"Not Prime");
    }
    public static boolean isPrime(int n){
        boolean isPrime = true;
        if (n==2){
            return isPrime;
        }
        else{
            for (int i = 2; i <n ; i++) {
                if(n%i==0) {
                    isPrime = false;
                    break;
                }
            }
            return isPrime;
        }
    }
}
