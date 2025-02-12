package A18_Bit_Manipulation;

import java.util.Scanner;

public class B1_Binary_to_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(binary_to_decimal(n));

    }
    public static int binary_to_decimal(int n){
        int pow = 0 ;
        int deciNum = 0 ;
        while (n>0){
            deciNum += (int) ((n%10)*Math.pow(2,pow));
            pow++;
            n/=10;
        }
        return deciNum;
    }
}
