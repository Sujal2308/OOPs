package CRT25.Assignments;
public class StringBuilderInJava {
    public static void main(String[] args){
        String s = "Hello";
        StringBuilder sb = new StringBuilder(s);
        sb.append("World");
        System.out.println(sb);
        sb.reverse();
    }
}
