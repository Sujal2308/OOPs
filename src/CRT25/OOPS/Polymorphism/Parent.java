package CRT25.OOPS.Polymorphism;
public class Parent {
    public boolean palindrome(int num){
        int demo = num;
        int val = 0;
        while(num>0){
            int lastDigit = num%10;
            val = val*10+lastDigit;
            num=num/10;
        }
     return (val==demo)?true:false;

    }

    public boolean palindrome(String str){
        String s = "";
        for(int i = str.length()-1 ; i>=0 ; i--){
            s+=str.charAt(i);
        }
        return s.equals(str);
    }

    public static void main(String[] args){
        Parent p = new Parent();
        boolean num = p.palindrome(1001);
        boolean s = p.palindrome("MalayalaM");

        System.out.println(num);
        System.out.println(s);
    }
}
