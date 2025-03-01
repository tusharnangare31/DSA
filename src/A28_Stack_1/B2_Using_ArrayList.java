package A28_Stack_1;

import java.util.ArrayList;

public class B2_Using_ArrayList {
    static class Stack{
        private final ArrayList<Integer> list = new ArrayList<>();
        // isEmpty
        public boolean isEmpty(){
            return list.size() == 0 ;
        }
        // push
        public  void push(int key){
            list.add(key);
        }
        // pop
        public int pop(){
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return list.remove(list.size() - 1);
        }

        public int peek(){
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return list.get(list.size() - 1);
        }



    }

    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.isEmpty());
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        System.out.println(s.isEmpty());


    }
}
