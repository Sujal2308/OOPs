package CRT25.BankManagementProject;

import java.util.Scanner;

public class OpenAccountService {
    Scanner sc = new Scanner(System.in);
    public void openAccount(){
        System.out.print("Enter your Full Name: ");
        CustomerData.name = sc.nextLine();
        System.out.print("Enter your age: ");
        CustomerData.age = sc.nextInt();
        System.out.print("Enter your Aadhar No: ");
        CustomerData.aadharNo = sc.nextInt();
        Customers user = new Customers(CustomerData.name,CustomerData.age,CustomerData.aadharNo);
        System.out.println("Account created successfully🥳");

    }
}
