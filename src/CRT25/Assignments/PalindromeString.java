package CRT25.Assignments;
public class PalindromeString {
    public static void main(String[] args){
        String str = "malayalam";

        //!logic 1
//        String palindromeStr = ReverseString.reverse(str);
//        System.out.println(palindromeStr);
//        boolean b = str.equals(palindromeStr)?true:false;
//        System.out.println(b);

        System.out.println(isPalindrome(str));
    }

    //!logic 2
    static boolean isPalindrome(String s){
        int low = 0;
        int high = s.length()-1;
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
