package A26_LinkList_1;

public class B1_Intro {
    public static class Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;

    // Methods
    public void addFirst(int data){ // O(1)
        //step1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2 = newNode next = head
        newNode.next = head;

        //step3 - head = newNode
        head = newNode;
    }

    public void addLast(int data){
        // create a node newNode
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        // tail.next = newNode
        tail.next = newNode;
        // tail = newNode
        tail = newNode;
    }
    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Add the element in middle
    public void add(int idx, int data){
        if (idx == 0) {
            addFirst(data);
        }
        size++;
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < idx-1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // remove first
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size ==1){
            int val = head.data;
            head=tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // remove last
    public int removeLast(){
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size --;
        return val;
    }

    // Search (Iterative)
    public int itrSearch(int key){
        Node temp = head;
        int i = 0;

        while(temp != null){
            if (temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }

    // Search (Recursive)
    public int helper(Node head ,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next,key);
        if (idx == -1) {
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }

//    remove()
//    print()
//    search()


    public static void main(String[] args) {
        B1_Intro ll = new B1_Intro();
        ll.print();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(1,4);
        ll.print();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println(ll.size) ;

        System.out.println(ll.itrSearch(3));
        System.out.println(ll.recSearch(3));
    }

}
