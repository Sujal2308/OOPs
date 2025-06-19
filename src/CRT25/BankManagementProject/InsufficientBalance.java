package CRT25.BankManagementProject;
public class InsufficientBalance extends RuntimeException{
    public InsufficientBalance(String message){
        super(message);
    }

    public void checkBalance(int balance) throws InsufficientBalance{
        if(balance>CustomerData.balance){
            throw new InsufficientBalance("sorry ,Insufficient balance");
        }
    }
}
