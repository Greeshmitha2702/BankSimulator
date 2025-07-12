import java.util.*;
public class Main{
    public static void main(String[] args) {
        System.out.println("Welcome to the bank management system!");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        while (true) {
            System.out.println("1. Create New Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Display Account Information");   
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int option=scanner.nextInt();
            switch(option){
                case 1:
                    System.out.print("Enter account holder name: ");
                    String name = scanner.next();
                    System.out.print("Enter initial balance: ");
                    double initialBalance = scanner.nextDouble();
                    System.out.println("Enter password:");
                    String password = scanner.next();
                    Account newAccount = new Account(name, initialBalance, password);
                    accounts.add(newAccount);
                    System.out.println("Account created successfully! Account Number: " + newAccount.getAccountNumber());
                    break;
                case 2:
                    System.out.print("Enter account number to deposit into: ");
                    int accountNumber = scanner.nextInt();
                    Account account1 = null;
                    for(Account account : accounts){
                        if(account.getAccountNumber() == accountNumber) {
                            account1 = account;
                            break;
                        }   
                    }
                    if(account1 == null) {
                        System.out.println("Account not found.");
                        continue;
                    }
                    System.out.print("Enter password: ");
                    String inputPassword = scanner.next();
                    if (!account1.checkPassword(inputPassword)) {
                        System.out.println("Incorrect password. Access denied.");
                        continue;
                    }
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account1.deposit(depositAmount);
                    break;
                case 3:
                System.out.print("Enter account number to withdraw from: ");
                    int AccountNumber = scanner.nextInt();
                    Account Account1 = null;
                    for(Account account : accounts){
                        if(account.getAccountNumber() == AccountNumber) {
                            Account1 = account;
                            break;
                        }   
                    }
                    if(Account1 == null) {
                        System.out.println("Account not found.");
                        continue;
                    }
                    System.out.print("Enter password: ");
                    String inputPassword1 = scanner.next();
                    if (!Account1.checkPassword(inputPassword1)) {
                        System.out.println("Incorrect password. Access denied.");
                        continue;
                    }
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    Account1.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.print("Enter account number to display information: ");
                    int displayAccountNumber = scanner.nextInt();
                    Account displayAccount = null;
                    for(Account account : accounts){        
                        if(account.getAccountNumber() == displayAccountNumber) {
                            displayAccount = account;
                            break;
                        }   
                    }
                    if(displayAccount == null) {
                        System.out.println("Account not found.");
                        continue;
                    }
                    System.out.print("Enter password: ");
                    String inputPassword2 = scanner.next();
                    if (!displayAccount.checkPassword(inputPassword2)) {
                        System.out.println("Incorrect password. Access denied.");
                        continue;
                    }
                    displayAccount.displayAccountInfo();
                    break;
                case 5:
                    System.out.println("Exiting the system. Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        
    }
}