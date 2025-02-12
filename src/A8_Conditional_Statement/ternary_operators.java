package A8_Conditional_Statement;

import java.util.Scanner;

public class ternary_operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // this is a ternary operator
        String type =(n%2==0)?"Even":"Odd";
        System.out.println(type);
        System.out.println((n%2==0)?"Even":"Odd");

        //Pass or Fail
        int marks= sc.nextInt();
        String Report = marks>=33?"Pass":"Fail";
        System.out.println(Report);
    }
}
