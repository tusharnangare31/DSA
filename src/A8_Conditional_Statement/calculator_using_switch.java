package A8_Conditional_Statement;

import java.util.Scanner;

public class calculator_using_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char ch = sc.next().charAt(0);
        switch (ch){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
        }
    }
}
