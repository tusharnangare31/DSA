package A17_Strings;

public class P1_Count_Vowels_In_LowerCase {
    public static void main(String[] args) {
        String str = "My name is tushar nangare";
        System.out.println(count(str));
    }
    public static int count(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch =='e'|| ch =='i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
