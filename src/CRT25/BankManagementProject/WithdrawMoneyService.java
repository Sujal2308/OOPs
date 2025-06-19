package CRT25.BankManagementProject;

import java.util.Scanner;

public class WithdrawMoneyService {
    Scanner sc = new Scanner(System.in);
    public void withdrawMoney(){
        if(CustomerData.name==null){
            System.out.println("To Withdraw Money, Create your account first");
            return;
        }
        System.out.print("Enter Amount: ");
        int amount = sc.nextInt();
            InsufficientBalance b = new InsufficientBalance("insufficient");
            try{
                b.checkBalance(amount);
            }catch (InsufficientBalance e){
                System.out.println(e.getMessage());
                return;
            }

        CustomerData.balance-=amount;
        System.out.println("Confirm the transaction '1' for yes '0' for no");
        int confirmation = sc.nextInt();
        if(confirmation==1){
            System.out.println("Money withdrawn successfully");
            System.out.println("Remaining Balance: "+CustomerData.balance);
        }else if(confirmation==0) {
            System.out.println("Transaction incomplete");
        }
    }
}
