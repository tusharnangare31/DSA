package A16_2D_Arrays;

public class P3_Transform {
    public static void main(String[] args) {
        String[][] arr = {
                {"a11","a12","a13"},
                {"a21","a22","a23"}
        };
        String[][] tran = new String[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                tran[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < tran.length; i++) {
            for (int j = 0; j < tran[0].length; j++) {
                System.out.print(tran[i][j]+" ");
            }
            System.out.println();
        }
    }
}
