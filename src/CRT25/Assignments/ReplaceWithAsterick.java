package CRT25.Assignments;
public class ReplaceWithAsterick {
    public static void main(String[] args){
        String s = " Sujal Bhugul ";
        String str = "";
        for(char c : s.toCharArray()){
            if(c==' '){
                c='*';
            }
            str+=c;
        }
        System.out.println(str);

    }
}
