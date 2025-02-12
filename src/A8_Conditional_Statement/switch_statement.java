package A8_Conditional_Statement;

import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
