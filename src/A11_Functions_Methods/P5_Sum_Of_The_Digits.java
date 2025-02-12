package A11_Functions_Methods;

import java.util.Scanner;

public class P5_Sum_Of_The_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(digit_sum(n));


    }
    public static int digit_sum(int n){
        int digit_sum = 0;
        while (n>0){
            digit_sum+=n%10;
            n/=10;
        }
        return digit_sum;
    }
}
