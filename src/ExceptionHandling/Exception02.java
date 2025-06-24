package ExceptionHandling;

import java.util.Arrays;

public class Exception02 {
    //!Unchecked Exceptions: Ignore by compiler - occurred mainly due to
    //! bad coding logic

    public static void main(String[] args){

        //! Scenario 1 - try contain no risky code
        try{
            System.out.println("Hello");
        }catch(Exception e){
            //* this catch block won't get executed since no exception occurred in corresponding try
            System.out.println(e);
        }

        //! Scenario 2- try contain risky code and corresponding catch handles it
        String str = null;
        try{
            int len = str.length();
            System.out.println(len);
        }catch (NullPointerException e){
            System.out.println(e.getStackTrace());
        }

        //! try contain risky and normal code as well ---not recommended
        try{
            int a = 10; //? normal statement --executes
            System.out.println(2/0); //! risky
            System.out.println("Value: "+a); //? normal -- not executed
        }catch (ArithmeticException e){
            System.out.println(e);
        }

        //! try contain multiple erroneous code that might throw exception
        int[] arr = {1,2,3,4}; // size : 4
        String s = null;
        try{
            System.out.println(arr[4]);
            System.out.println(s.length()); //!skipped not caught because above line throws exception
        }catch (ArrayIndexOutOfBoundsException | NullPointerException e){ //? multi catch statement -- java 8
            System.out.println(Arrays.toString(e.getStackTrace()));
        }


        InvalidAgeException age = new InvalidAgeException("hello");

        try{
            age.checkAge(0);

        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
