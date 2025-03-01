package A29_Stack_2;
import java.util.*;
public class B1_Valid_Parentheses {
    public static void main(String[] args) {
        String str = "{()}{}[{}]"; // true
        String str1 = "{()}{}[{]"; // false
        System.out.println(isValid(str));
        System.out.println(isValid(str1));
    }
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Opening Parentheses
            if(ch == '(' || ch == '[' || ch == '{'){
                s.push(ch);
            }
            // Closing Parentheses
            else {
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']')){
                    s.pop();
                }
            }
        }
        if (s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
