package A17_Strings;

public class B5_SubString {
    public static void main(String[] args) {
        String str = "Hello World";
        // User defind function to print sub string
        System.out.println(subString(str,0,5));
        //Inbuilt function in java to print the sub strings
        System.out.println(str.substring(0,5));


    }
    public static String subString(String Str,int si,int ei){
        String str="";
        for (int i = si; i < ei; i++) {
            str+=Str.charAt(i);
        }
        return str;
    }

}
