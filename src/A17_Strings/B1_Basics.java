package A17_Strings;

import java.util.Scanner;
import java.util.SortedMap;

public class B1_Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Strings are Immutable
        String a = new String("abcd");
        String b = new String("abcd");
        String c = "abcd";
        String d = "abcd";

        // == check it check the memory location of object
        System.out.println(a==b);
        System.out.println(c==d);

        // .equal() check the the actual values of the String
        System.out.println(a.equals(b)?"They are equal":"They are not equal");

        // Concatenation
        String Fname = "Tushar";
        String Lname = "Nangare";
        String name = Fname+" "+Lname;
        System.out.println(name);

        printString(name);
    }
    public static void printString(String a){
        for (int i = 0; i < a.length(); i++) {
            System.out.print(a.charAt(i)+" ");
        }
    }
}
