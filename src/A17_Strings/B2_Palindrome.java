package A17_Strings;

public class B2_Palindrome {
    public static void main(String[] args) {
        String name = "naan";
        System.out.println(isPalindrome(name) ?"Palindrome":"Not Palindrome");
    }
    public static boolean isPalindrome(String name){
        for (int i = 0; i < name.length()/2; i++) {
            if (name.charAt(i) != name.charAt(name.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}
