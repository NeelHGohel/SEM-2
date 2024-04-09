// Create a class named Bank_Account with data memebers accountNo, userName, email, accountType and accountBalance, 
// Also create methods getAccountDetails() and displayAccountDetails().
import java.util.Scanner;
public class BankAccount {
    public static void main(String[] args) {
        Bank_Account a = new Bank_Account();
        a.getAccountDetails();
        a.displayAccountDetails();
    }
}
class Bank_Account{
    int accountNo ;
    String userName;
    String email;
    String accountType;
    int accountBalance;
    void getAccountDetails(){
        Scanner as = new Scanner(System.in);
        System.out.println("Enter your account no. : ");
        accountNo = as.nextInt();
        System.out.println("Enter your name : ");
        userName = as.next();
        System.out.println("Enter your email : ");
        email = as.next();
        System.out.println("Enter your account type : ");
        accountType = as.next();
        System.out.println("Enter your account balance : ");
        accountBalance = as.nextInt();  
    }
    void displayAccountDetails(){
        System.out.println("Your account no is = "+accountNo);
        System.out.println("Your name is = "+userName);
        System.out.println("Your email is = "+email);
        System.out.println("Your account type is = "+accountType);
        System.out.println("Your Account Balance is = "+accountBalance);
    }
}