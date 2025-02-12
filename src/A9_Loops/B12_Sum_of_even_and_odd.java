package A9_Loops;

import java.util.Scanner;

public class B12_Sum_of_even_and_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        char choice;
        int even_sum = 0;
        int odd_sum = 0;
        do {
            n = sc.nextInt();
            if (n%2 == 0) {
                even_sum+=n;
            }else{
                odd_sum+=n;
            }
            System.out.println("If you want to continue press yes otherwise press no");
            choice = sc.next().charAt(0);
            choice = Character.toLowerCase(choice);

        }while (choice=='y');
        System.out.println("Sum of even :"+even_sum);
        System.out.println("Sum of odd :"+odd_sum);
    }
}
