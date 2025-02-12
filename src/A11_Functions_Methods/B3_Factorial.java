package A11_Functions_Methods;

import java.util.Scanner;

public class B3_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = fact(n);
        System.out.println("Factorial of number is : "+fact);


    }
    public static int fact(int n){
        int fact = 1;
        if (n == 0) {
            return 1;
        }
        else {
            do{
                fact*=n;
                n--;
            }while (n>0);
        }
        return fact;
    }
}
