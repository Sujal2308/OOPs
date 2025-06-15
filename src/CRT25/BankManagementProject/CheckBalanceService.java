package CRT25.BankManagementProject;

public class CheckBalanceService {
    public void checkBalance(){
        if(CustomerData.name==null){
            System.out.println("To Check Balance, Create your account first");
            return;
        }
        System.out.println("Current Account Balance💸: "+CustomerData.balance);
    }
}
