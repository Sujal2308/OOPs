package CRT25.BankManagementProject;

import java.util.Scanner;

public class DepositMoneyService {
     Scanner sc = new Scanner(System.in);
     public void depositMoney(){
          if(CustomerData.name==null){
               System.out.println("To Deposit Money, Create your account first");
               return;
          }
          System.out.print("Enter Amount : ");
          int money = sc.nextInt();
          CustomerData.balance = CustomerData.balance+money;
          System.out.println("Confirm the transaction '1' for yes '0' for no");
          int confirmationId = sc.nextInt();
          if(confirmationId==1){
               System.out.println("Money added successfully");
               System.out.println("Total balance: "+CustomerData.balance);
          }else {
               System.out.println("Transaction failed");
          }


     }


}
