package A8_Conditional_Statement;

import java.util.Scanner;

public class Largest_of_three_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        if(a>b){
//            if(a>c){
//                System.out.println("a is Greater");
//            }
//            else {
//                System.out.println("c is Greater");
//            }
//        }
//        else{
//            if (b>c){
//                System.out.println("b is Greater");
//            }
//            else{
//                System.out.println("c is Greater");
//            }
//        }

        if (a>=b && a>=c){
            System.out.println("a ia greater");
        } else if (b>=c) {
            System.out.println("b is greater");
        }
        else {
            System.out.println("c is greater");
        }
    }
}
