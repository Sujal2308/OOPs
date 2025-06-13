package CRT25.Assignments;

public class ReverseString {
    public static void main(String[] args){
        String str = "ABCDE";
        String rev = reverse(str);
        System.out.println("Reverse String: "+rev);
    }

    static String reverse(String str){
        String newStr = "";
        for(int  i = str.length()-1 ; i>=0; i--){
            newStr+=str.charAt(i);
        }
        return newStr;
    }
}
