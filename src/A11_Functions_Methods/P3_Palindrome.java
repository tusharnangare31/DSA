package A11_Functions_Methods;

import java.util.Scanner;

public class P3_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(palindrome(n)?"Palindrome":"Not Palindrome");
    }
    public static boolean palindrome(int n){
        int rev = 0;
        int temp = n;
        while (temp>0){
            rev=rev*10+(temp%10);
            temp/=10;
        }
        return rev==n;
    }
}
