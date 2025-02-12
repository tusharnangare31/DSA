package A12_Patterns_Part2_Advance;

import java.awt.*;
import java.util.Scanner;

public class B4_Floyds_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        floyds_triangle(n);

    }
    public static void floyds_triangle(int n){
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(count+++" ");
            }
            System.out.println();
        }
    }
}
