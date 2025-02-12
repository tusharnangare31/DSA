package A9_Loops;

import java.util.Scanner;

public class B14_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(n+" X "+i+" = "+n*i);
        }
    }
}
