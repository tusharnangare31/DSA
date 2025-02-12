package A11_Functions_Methods;

import java.util.Scanner;

public class B9_Binary_to_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binary_to_decimal(n);

    }
    public static void binary_to_decimal(int n){
        int pow = 0;
        int decNum = 0;
        while (n>0){
            decNum +=(int) ((n%10)*Math.pow(2,pow));
            pow++;
            n/=10;
        }
        System.out.println(decNum);
    }
}
