package A18_Bit_Manipulation;

import java.util.Scanner;

public class B5_Set_ith_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(setIthBit(n,i));

    }
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
}
