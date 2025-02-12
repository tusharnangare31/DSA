package A6_Variables_Datatypes;

import java.util.Scanner;

public class PracticeQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Question 1
        int a = 5;
        int b = 7;
        int c = 4;
        double avg = (double)(a+b+c)/3;
        System.out.println(avg);

        // Question 2
        int s1 = 5;
        int s2 =10;
        int A = s1*s2;
        System.out.println("Area of Square : "+A);

        // Question 3
        int pen = 10;
        int pencil = 6;
        int eraser = 5;
        double total = pen+pencil+eraser;
        total = total+(18/100d)*total;
        System.out.println("Total Price : "+total);

        // Question 5
        int $ = 6;
        System.out.println();
    }
}
