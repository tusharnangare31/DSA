package A20_Recursion;

public class B8_Print_x_To_The_Power_n {
    public static void main(String[] args) {
        System.out.println(power(2,5));

    }
    public static int power(int x,int n){
        if (n==0){
            return 1;
        }
        return x*power(x,n-1);
    }

}
