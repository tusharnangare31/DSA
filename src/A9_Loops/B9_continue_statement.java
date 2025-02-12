package A9_Loops;

import java.util.Scanner;

public class B9_continue_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);

        }

    }
}
