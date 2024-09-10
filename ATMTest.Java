
package atm;
import java.util.Scanner;

class User {
    private String accountNumber;
    private String pin;
    private double balance;
    
    public User (String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    
    public boolean validatePin(String inputPin){
        return this.pin.equals(inputPin);
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void withdraw(double amount){
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance $" + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

class ATM {
    private User currentUser;
    
    public void login (User user, String pin) {
        if (user.validatePin(pin)) {
            currentUser = user;
            System.out.println("Login successful.");
        } else {
            System.out.println("Invalid PIN.");
        }
    }
    
    public void checkBalance(){
        if (currentUser != null) {
            System.out.println("Current balance: $" + currentUser.getBalance());
        } else {
            System.out.println("Please log in first");
        }
    }
    
    public void withdraw (double amount){
        if (currentUser != null) {
            currentUser.withdraw(amount);
        } else {
            System.out.println("Please log in first");
        }
    }
}

public class ATMTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ATM atm = new ATM();
        
        //Test user
        User user = new User ("12345", "6789", 3000.00);
        
        System.out.println("Welcome to the ATM");
        System.out.println("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.println("Enter PIN: ");
        String pin = scanner.nextLine();
        
        atm.login (user, pin);
        
        boolean running = true;
        while (running) {
            System.out.println("\n1. Check balance\n2. Withdraw\n3. Exit");
            System.out.println("Choose an option: ");
            int option = scanner.nextInt();
            
            switch (option) {
                case 1: 
                    atm.checkBalance();
                    break;
                case 2: 
                    System.out.println("Enter amount: ");
                    double amount = scanner.nextDouble();
                    atm.withdraw(amount);
                    break;
                case 3:
                    running = false;
                    System.out.println("Thank you for using ATM.");
                    break;
                default:
                    System.out.println("Invalid option. Try another;");
            }
        }
        
        scanner.close();
    }
    
}
