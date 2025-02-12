package A18_Bit_Manipulation;

import java.util.Scanner;

public class B2_Decimal_to_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(decimal_to_binary(n));

    }
    public static int decimal_to_binary(int n){
        int pow = 0 ;
        int binNum = 0 ;
        while (n>0){
            binNum += (int)((n%2)*Math.pow(10,pow));
            n/=2;
            pow++;
        }
        return binNum;
    }
}
