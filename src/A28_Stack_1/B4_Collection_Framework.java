package A28_Stack_1;

import java.util.Stack;

public class B4_Collection_Framework {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

    }
}
