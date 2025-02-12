package A9_Loops;

import java.util.Scanner;

public class B11_Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n < 2) {
            isPrime = false;
        }
        else{
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n%i==0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime){
            System.out.println(n+" is Prime Number");
        }
        else{
            System.out.println(n+" is not Prime Number");
        }
    }
}
