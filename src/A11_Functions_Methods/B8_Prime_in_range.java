package A11_Functions_Methods;

import java.util.Scanner;

public class B8_Prime_in_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <=b ; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }

    }
    public static boolean isPrime(int n){
        if (n < 2){
            return false;
        }
        else {
            for (int i = 2; i < Math.sqrt(n) ; i++) {
                if (n%i == 0) {
                    return false;
                }
            }
        }
        return true;

    }
}
