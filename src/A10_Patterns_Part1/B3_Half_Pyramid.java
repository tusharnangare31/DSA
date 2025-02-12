package A10_Patterns_Part1;

import java.util.Scanner;

public class B3_Half_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }
}
