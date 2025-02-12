package A12_Patterns_Part2_Advance;

import java.util.Scanner;

public class B1_Hollow_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        hollow_rectangle(rows,cols);


    }
    public static void hollow_rectangle(int rows,int cols){
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i==1 ||i==rows ||j==1||j==cols) {
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

    }
}
/*
7
8
********
*      *
*      *
*      *
*      *
*      *
********
*/