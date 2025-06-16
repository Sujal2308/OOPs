package CRT25.BankManagementProject;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args){
        System.out.println("Hello Welcome to Java Bank how can we help you???");
        ServicesOfferedByBank.servicesOffered();


        Scanner sc = new Scanner(System.in);


        while(true){
            int service = sc.nextInt();
        switch (service){
            case 1: {
                OpenAccountService service1 = new OpenAccountService();
                service1.openAccount();
                servicesOffered();
                break;
            }
            case 2: {
                DepositMoneyService service2 = new DepositMoneyService();
                service2.depositMoney();
                servicesOffered();
                break;
            }
            case 3:{
                WithdrawMoneyService service3 = new WithdrawMoneyService();
                service3.withdrawMoney();
                servicesOffered();
                break;
            }
            case 4:{
                CheckBalanceService.checkBalance();
                servicesOffered();
                break;
            }
            case 5:{
                UserDetailsSerivice service5 = new UserDetailsSerivice();
                service5.getCustomerDetails();
                servicesOffered();
                break;
            }
            case 6:{
                Customers C = new Customers();
                C.userData();
                break;
            }
            case 0: System.exit(1);
            default:System.out.println("No such service ❌ enter valid number!!!");

        }
    }
}
static void servicesOffered(){
        Scanner sc = new Scanner(System.in);
    System.out.println("=========================");
    System.out.println("Press 1️⃣ to view services or 0️⃣ to exit");
        int input = sc.nextInt();
        if(input==1){
            ServicesOfferedByBank.servicesOffered();
        }
        else if(input==0){
            System.exit(100);
        }else {
            System.out.println("404!!!");
        }
}
}
