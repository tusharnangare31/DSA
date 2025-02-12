package A17_Strings;

public class B6_Largest_String {
    public static void main(String[] args) {
        String[] Names = {"Kalpesh","Tushar","Rameshwar","Sarvesh"};
        System.out.println(largestString(Names));

    }
    public static String largestString(String[] arr){
        String largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (largest.compareTo(arr[i])<0) {
                largest = arr[i];
            }
            
        }
        return largest;
    }
}
