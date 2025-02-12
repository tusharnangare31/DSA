package A18_Bit_Manipulation;

import java.util.Scanner;

public class B6_Clear_ith_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(clearIthBit(n,i));

    }
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
}
