package A8_Conditional_Statement;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n < 2) {
            isPrime =false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n%i==0){
                    isPrime=false;
                    break;
                }

            }

        }
        if(isPrime){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
