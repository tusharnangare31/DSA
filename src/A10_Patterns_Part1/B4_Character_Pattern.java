package A10_Patterns_Part1;

import java.util.Scanner;

public class B4_Character_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
