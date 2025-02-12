package A9_Loops;

import java.util.Scanner;

public class Sum_Of_First_N_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),sum=0;
        while(n>0){
            sum+=n;
            n--;
        }
        System.out.println(sum);
    }
}
