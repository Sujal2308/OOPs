package CRT25.BankManagementProject;
public class UserDetailsSerivice {
    public void getCustomerDetails(){
        if(CustomerData.name != null){
          System.out.println("Name: "+CustomerData.name);
          System.out.println("Age: "+CustomerData.age);
          System.out.println("Aadhar Number: "+CustomerData.aadharNo);
          System.out.println("Current Balance: "+CustomerData.balance);
        }else System.out.println("User doesn't exist!!!");
    }
}
