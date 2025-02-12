package A11_Functions_Methods;

import java.util.Scanner;

public class B10_Decimal_to_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decimal_to_binary(n);
    }
    public static void decimal_to_binary(int n){
        int pow =0;
        int binNum = 0;
        while (n>0){
            binNum+=(int)((n%2)*Math.pow(10,pow));
            n/=2;
            pow++;
        }
        System.out.println(binNum);
    }
}
