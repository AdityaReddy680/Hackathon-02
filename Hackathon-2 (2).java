import java.util.Scanner;

class BankAccount {
    Scanner sc = new Scanner(System.in);
    String accountNumber;
    String accountHolderName;
    double balance;

    
    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: Rs. " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: Rs. " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    double checkBalance() {
        return balance;
    }

    
    void displayAccount() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: Rs. " + checkBalance());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        
        BankAccount account = new BankAccount(
            accountNumber,
            accountHolderName,
            balance
        );

        
        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);


        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = sc.nextDouble();
        account.withdraw(withdrawalAmount);


        account.displayAccount();

        sc.close();
    }
}