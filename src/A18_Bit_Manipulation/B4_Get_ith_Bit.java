package A18_Bit_Manipulation;

import java.util.Scanner;

public class B4_Get_ith_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(getIthBit(n,i));

    }
    public static int getIthBit(int n,int i){
        int bitMask = 1<<i;
        if ((n & 1<<i)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
}
