package A9_Loops;

import java.util.Scanner;

public class B13_Factorial {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int fact = 1;
        do{
            fact*=n;
            n--;
            i++;
        }while(n>0);
        System.out.println("Factorial of "+i+" = "+fact);
    }
}
