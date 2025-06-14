package CRT25.Assignments;
public class VowelsConsonants {
    public static void main(String[] args){
//        System.out.println((int)'a'+ " "+ (int)'z');
//        System.out.println((int)'A'+ " "+ (int)'Z');

        String str = "AEIOGD F123"; // 2 vowels , 4 consonants
        countVowelsAndConsonants(str);

    }
    static void countVowelsAndConsonants(String str){
        String s = str.toLowerCase();
        int countVowels = 0;
        int countConsonants= 0;
        for(char c : s.toCharArray()){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                countVowels++;
            }
            else if(c>='a' && c<='z'){
                countConsonants++;
            }
        }
//        countConsonants = str.length()-countVowels;

        System.out.println("Vowels : "+countVowels);
        System.out.println("Consonants : "+countConsonants);



    }
}
