package CRT25;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        int num1 =  sc.nextInt();
        System.out.print("Enter Number2: ");
        int num2 = sc.nextInt();
        String operator = sc.next();
        switch(operator){
            case "+" -> System.out.println(num1+num2);
            case "-" -> System.out.println(num1-num2);
            case "*" -> System.out.println(num1*num2);
            case "/" -> System.out.println(num1/num2);
            default -> System.out.println("Enter valid operator");

        }
    }
}
