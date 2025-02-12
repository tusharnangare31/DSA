package A9_Loops;

import java.util.Scanner;

public class Print_1_to_n_using_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}
