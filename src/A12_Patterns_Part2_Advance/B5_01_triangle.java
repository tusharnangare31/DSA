package A12_Patterns_Part2_Advance;

import java.util.Scanner;

public class B5_01_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        triangle_01(n);
    }
    public static void triangle_01(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j)%2==0){
                    System.out.print(1);
                }
                else {
                    System.out.print(0);
                }
                
            }
            System.out.println();
        }
    }
}
