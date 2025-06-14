package CRT25.Assignments;

import java.util.ArrayList;
import java.util.List;

public class RemoveSpaces {
   public static void main(String[] args){
       String s= " Hello'/122  india ";
       String str = "";
       for(char c: s.toCharArray()){
           if(!checkPunctuations(c)){
               str+=c;
           }
       }
       System.out.println(str);
   }
   static boolean checkPunctuations(char ch){
       char[] punctuations = {
               ' ','.', ',', '!', '?', ':', ';', '-', '—', '(', ')', '[', ']', '{', '}', '\'', '\"', '/', '\\', '@', '#', '$', '%', '^', '&', '*', '_', '+', '=', '<', '>', '|', '`', '~'
       };
       List<Character> list = new ArrayList<>();
       for(char c : punctuations){
           list.add(c);
       }
       if(list.contains(ch)){
           return true;
       }
       return false;
   }
}
