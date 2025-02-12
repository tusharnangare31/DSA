package A17_Strings;

public class B8_Convert_Letters_To_UpperCase {
    public static void main(String[] args) {
        String str = "hi, i am tushar nangare";
        System.out.println(convertFirstLetters(str));
    }
    public static String convertFirstLetters(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i)==' '){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
