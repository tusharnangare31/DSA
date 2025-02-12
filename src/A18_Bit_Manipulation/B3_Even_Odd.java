package A18_Bit_Manipulation;

import java.util.Scanner;

public class B3_Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(evenOdd(n)?"Even":"Odd");

    }
    public static boolean evenOdd(int n){
        if ((n & 1) ==1) {
            return false;
        }
        return true;
    }
}
