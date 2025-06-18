package ExceptionHandling;
 class InvalidAgeException extends Exception {
    //! custom exception
    public InvalidAgeException(String message){
        super(message);
    }

    public   int checkAge(int age) throws InvalidAgeException{
        if(age<20){
            throw new InvalidAgeException("Invalid age");
        }
        return age;
    }
}
