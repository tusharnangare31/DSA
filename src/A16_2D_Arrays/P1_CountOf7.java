package A16_2D_Arrays;

public class P1_CountOf7 {
    public static void main(String[] args) {
        int[][] arr = { {4,7,8},{8,8,7} };
        System.out.println(countOf7(arr));

    }
    public static int countOf7(int[][] arr){
        int countOf7 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 7) {
                    countOf7++;
                }
            }
        }
        return countOf7;
    }
}
