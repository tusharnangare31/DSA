package A17_Strings;

public class B4_Compare {
    public static void main(String[] args) {
        String a = "Tony";
        String b = "Tony";
        String c = new String("Tony");

        System.out.println(a==b?"a and b are equal":"a and b are not equal");
        System.out.println(a==c?"a and c are equal":"a and c are not equal");
        // Using .equals() function they get equal
        System.out.println(a.equals(c)?"a and c are equal":"a and c are not equal");
    }
}
