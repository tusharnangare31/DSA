package A11_Functions_Methods;

import java.util.Scanner;

public class P2_isEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isEven(n)?"Even":"Odd");

    }
    public static boolean isEven(int n){
        if (n%2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
