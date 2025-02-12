package A11_Functions_Methods;

public class B1_Call_By_Value {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        swap(a,b);
        // Here the value changed of a and b only in the function
        // If we want these values in  manin function then we want to return values
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
