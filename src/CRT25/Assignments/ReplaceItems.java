package CRT25.Assignments;
public class ReplaceItems {
    public static void main(String[] args){
        String str = "HelloWorld";

        String newStr = "";
        for(char c : str.toCharArray()){
            c = '*';
            newStr +=c;
        }
        System.out.println(newStr);
    }
}
