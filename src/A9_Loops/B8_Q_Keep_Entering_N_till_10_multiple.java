package A9_Loops;

import java.util.Scanner;

public class B8_Q_Keep_Entering_N_till_10_multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
            if (n%10 == 0) {
                break;
            }
            System.out.println(n);

        }while(true);
    }
}
