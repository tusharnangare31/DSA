package A6_Variables_Datatypes;

import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World");
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j>i ; j--) {
                System.out.print("* ");

            }
            System.out.println();
        }
        // Sum of a and b
        int a = 5 , b= 10 ,sum;
        sum=a+b;
        System.out.println("Sum of a & b :"+sum);
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a+b;
        int pro = a*b;
        System.out.println("Sum of a & b :"+sum);
        System.out.println("Product of a & b :"+pro);

        // Area Of Circle
        int r = sc.nextInt();
        double A = 2*(22/7d)*Math.pow(r,2);// To convert number into double we add suffix d
        System.out.println(A);

        int area = (int) A;         //Type Casting
        System.out.println(area);

        System.out.println(3*4.33f*23.4242d/2); //Type Promotion double is Promoted

        byte c = 3;
        c = (byte)(c*2);  //Here b is the byte but the 2 is int,so we want to convert it into byte first
        System.out.println(c);
    }
}
