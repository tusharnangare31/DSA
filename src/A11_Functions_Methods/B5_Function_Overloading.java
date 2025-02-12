package A11_Functions_Methods;

public class B5_Function_Overloading {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = sum(a,b);
        System.out.println(sum);
        sum = sum(a,a,b);
        System.out.println(sum);

    }

    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a,int b ,int c){
        return a+b+c;
    }
    public static int sum(float a,float b){
        return (int)(a+b);
    }
}
