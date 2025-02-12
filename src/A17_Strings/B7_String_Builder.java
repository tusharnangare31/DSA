package A17_Strings;

public class B7_String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        for (char i = 'a'; i <='z' ; i++) {
            sb.append(i);
            System.out.println(sb);
        }


    }
}
