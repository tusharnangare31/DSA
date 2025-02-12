package A9_Loops;

public class B10_Q_Print_except_multiple_of_10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i%5 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
