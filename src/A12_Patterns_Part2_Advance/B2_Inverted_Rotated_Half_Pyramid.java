package A12_Patterns_Part2_Advance;

import java.util.Scanner;

public class B2_Inverted_Rotated_Half_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pyramid(n);

    }
    public static void pyramid(int n){
        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <n-i ; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j <i ; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
/*
5

    *
   **
  ***
 ****
*****
*/