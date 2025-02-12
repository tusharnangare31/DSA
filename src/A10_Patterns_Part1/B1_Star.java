package A10_Patterns_Part1;

import java.util.Scanner;

public class B1_Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
