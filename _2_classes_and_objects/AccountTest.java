package _2_classes_and_objects;
/* Problem 1.5)
Define a class Account to represent a bank account. Include the following members.
Instance Variable: Name of the depositor, Account number, Account type, Balance amount in
the account.
Method: To assign initial values, To deposit an amount, To withdraw an amount after checking
the balance, To display name and balance.
Write a program to test the program for a given number of customers. The program should be
able to search any customer if the account number is provided.
*/

import java.util.Scanner;
class Account {
    private String name;
    private int accountNumber;
    private String accountType;
    private double balance;

    public Account(String name, int accountNumber, String accountType, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
        }
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account type: " + accountType);
        System.out.println("Balance: " + balance);
    }

    public static Account searchAccount(Account[] accounts, int accountNumber) {
        for (Account account : accounts) {
            if (account.accountNumber == accountNumber) {
                return account;
            }
        }
        return null;
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of customers
        System.out.println("Enter the number of customers: ");
        int n = scanner.nextInt();

        // Create an array to store the accounts
        Account[] accounts = new Account[n];

        // Get the account details for each customer
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the account details for customer " + (i + 1) + ": ");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Account number: ");
            int accountNumber = scanner.nextInt();
            System.out.print("Account type: ");
            String accountType = scanner.next();
            System.out.print("Balance: ");
            double balance = scanner.nextDouble();

            // Create an account object
            Account account = new Account(name, accountNumber, accountType, balance);

            // Add the account to the array
            accounts[i] = account;
        }

        // Search for an account by account number
        System.out.println("Enter the account number to searched for: ");
        int accountNumber = scanner.nextInt();

        // Find the account
        Account account = Account.searchAccount(accounts, accountNumber);

        // Display the account details
        if (account != null) {
            System.out.println("Account found:");
            account.display();
        } else {
            System.out.println("Account not found");
        }
        scanner.close();
    }
}

/*
 OUTPUT:
 --------
Enter the number of customers: 
3
Enter the account details for customer 1: 
Name: AMAN
Account number: 123123123
Account type: Current
Balance: 4500000
Enter the account details for customer 2: 
Name: ABHISHEK
Account number: 456456456
Account type: Savings
Balance: 1800000
Enter the account details for customer 3: 
Name: RANVIR
Account number: 789789789
Account type: Savings
Balance: 2200000
Enter the account number to searched for: 
123123123
Account found:
Name: AMAN
Account number: 123123123
Account type: Current
Balance: 4500000.0 
 */
