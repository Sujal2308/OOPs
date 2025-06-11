package CRT25;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // multi class communication
//            int value = sc.nextInt();
//            System.out.println(isPrime(value));

//            int val = sc.nextInt();
//            printPrimes(val);

//            System.out.println(isArmstrong(153));
            System.out.println(isPalindrome(15251));

            int count = 0;

            for(int i =1 ; i<1000 ; i++){
                boolean bool = isPalindrome((i));
                        if(bool){
                            count++;
                            System.out.println(i);
                        }

            }
            System.out.println("Total palindrome : "+count);
        }

    static boolean isPrime(int num){
        if(num==1){
            return false;
        }
        for(int i= 2 ; i<num ; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    //! check armstrong or not
    static boolean isArmstrong(int num){
        int count = (int)Math.log10(num)+1;
        int demo = num;
        int sum = 0;
        while(num>0){
                int val = num % 10;
                sum = sum + (int) Math.pow(val,count);
                num = num /10;
        }
        if(sum==demo){
            return true;
        }
        return false;
    }

    //! print primes
    static void printPrimes(int val){
        int count = 0;
        for(int i = 2 ; i<=val ; i++){
                boolean prime = isPrime(i);
                if(prime){
                    count++;
                    System.out.println(i);
                }
        }
        System.out.println("count "+count);
    }


    //! palindrome

    static boolean isPalindrome(int num){
        int demo = num;
        int newNum = 0;
        while(num>0){
            int val = num%10;
            newNum = newNum*10+val;
            num /= 10;
        }
        if(demo == newNum){
            return true;
        }
        return false;
    }
}



