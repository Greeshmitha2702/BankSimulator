import java.util.*;
public class Main{
    public static void main(String[] args) {
        System.out.println("Welcome to the bank management system!");
        Account account1 = new Account("Greeshmitha", 5000);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Display Account Information");   
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int option=scanner.nextInt();
            switch(option){
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account1.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account1.withdraw(withdrawAmount);
                    break;
                case 3:
                    account1.displayAccountInfo();
                    break;
                case 4:
                    System.out.println("Exiting the system. Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        
    }
}