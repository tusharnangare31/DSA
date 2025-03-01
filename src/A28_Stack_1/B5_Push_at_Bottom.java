package A28_Stack_1;

import java.util.Stack;

public class B5_Push_at_Bottom {
    public static void pushAtBottom(Stack<Integer> s , int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.peek();
        pushAtBottom(s,data);
        s.push(top);
    }
    public static void main(String[] args) {
        // recursion - O(n);
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s,4);
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }

    }
}
