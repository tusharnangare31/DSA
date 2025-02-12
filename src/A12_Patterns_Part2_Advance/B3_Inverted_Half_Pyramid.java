package A12_Patterns_Part2_Advance;

import java.util.Scanner;

public class B3_Inverted_Half_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Inverted_Half_Pyramid(n);

    }
    public static void Inverted_Half_Pyramid(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<=n-i+1 ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
