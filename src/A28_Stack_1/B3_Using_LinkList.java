package A28_Stack_1;

import java.util.ArrayList;

public class B3_Using_LinkList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head = null;

        public boolean isEmpty(){
            return head == null;
        }
        public void push(int data){
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public int pop(){
            if (isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;

        }
        public int peek(){
            if (isEmpty()){
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        B2_Using_ArrayList.Stack s = new B2_Using_ArrayList.Stack();
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
