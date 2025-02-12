package A11_Functions_Methods;

import java.util.Scanner;

import static A11_Functions_Methods.B3_Factorial.fact;

public class B4_Binomial_Coef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int binomial = binomial(n,r);
        System.out.println("Binomial Coefficient of "+n+"C"+r+":"+binomial);
    }
    public static int binomial(int n , int r){
        return fact(n)/(fact(n-r)*fact(r));
    }

}
