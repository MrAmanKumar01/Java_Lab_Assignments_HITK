package _3_inheritance;
/* Problem 6) Assume that a Bank maintains two kinds of accounts for its customers, one called savings
account and the other current account. The savings account provides compound interest and
withdrawal facilities. The current account provides no interest. Current account holders
should maintain balance and if the balance falls below this level, a service charge is imposed.

o Create a class Account that stores customers name, account number and type of the
account. From this derive the classes CurAccount and SavAccount to make them
more specific to their requirements.

o Include the necessary methods in order to achieve the following tasks:
Assign initial values
Accept deposit from a customer and update the balance
Permit withdrawal and update the balance
Compute and deposit interest
Check for the minimum balance, impose penalty, if necessary, and update it.
Display the balance

o Write a program that creates an array of Bank Account and displays a menu that lets a
new account to be created, perform deposit and withdrawal transactions on the basis
of account number, display the balance of account holder for whom the account
number is provided.*/

//package Inheritance;

import java.util.Scanner;

class Account { //creates base(Account) class

    //Declare instance variables
    private String name;
    private int accountNumber;
    private String accountType;
    private double balance;

    public Account(String name, int accountNumber, String accountType, double balance) { //create parameterized constructor
        //initialize instance variable
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;      //return value of private data member(accountNumber)
    }

    public void deposit(double amount) {  //method to deposit amount passed as parameter
        balance += amount; //add amount to balance
        System.out.println("Deposit successful. Updated balance: " + balance);
    }

    public void withdraw(double amount) { //method to withdraw amount passed as parameter
        if (balance >= amount) { //checks if amount is less than or equals to balance
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    public void computeAndDepositInterest(double rate) { //method to computeAndDepositInterest interest rate passed as parameter
        if ("Savings".equals(accountType)) { //checks if accountType equals to Savings
            double interest = balance * rate / 100; //calculate interest
            balance += interest; //add balance
            System.out.println("Interest computed and deposited. Updated balance: " + balance);
        } else {
            System.out.println("Interest is not applicable to the current account.");
        }
    }

    public void checkMinimumBalance(double minBalance, double penalty) { //method to checkMinimumBalance where minBalance and penalty passed as parameters
        if (balance < minBalance) { //checks if balance less than min balance
            balance -= penalty; // minus penalty from balance
            System.out.println("Minimum balance not maintained. Penalty imposed. Updated balance: " + balance);
        } else {
            System.out.println("Minimum balance maintained. No penalty.");
        }
    }

    public void displayBalance() { //method to display balance
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}

class CurAccount extends Account { // creates subclass(CurAccount) of base(Account) class

    //declare instance variable
    private double minimumBalance;

    public CurAccount(String name, int accountNumber, double balance, double minimumBalance) { //create parameterized constructor
        super(name, accountNumber, "Current", balance); //pass parameters to base class constructor
        this.minimumBalance = minimumBalance; //initialize instance variable

    }
}

class SavAccount extends Account { // creates subclass(SavAccount) of base(Account) class

    //declare instance variable
    private double interestRate;

    public SavAccount(String name, int accountNumber, double balance, double interestRate) { //create parameterized constructor
        super(name, accountNumber, "Savings", balance); //pass parameters to base class constructor
        this.interestRate = interestRate; //initialize instance variable
    }

}

public class Problem6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter no. of accounts:- ");
        int maxAccounts = scanner.nextInt();

        //declare object array of Account class and initialize it's size as maxAccounts
        Account[] accounts = new Account[maxAccounts];

        int accountCount = 0; //declare and initialize accountCount

        while (true) {
            System.out.println("\n----- Bank Menu -----");
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Compute and deposit interest");
            System.out.println("5. Check minimum balance and impose penalty");
            System.out.println("6. Display balance");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (accountCount < maxAccounts) { //checks if the accountCount is less than maxAccounts

                        System.out.print("Enter customer name: ");
                        String d = scanner.nextLine();
                        String customerName = scanner.nextLine();
                        System.out.print("Enter account number: ");
                        int accountNumber = scanner.nextInt();
                        System.out.print("Enter account type (Current/Savings): ");
                        String accountType = scanner.next();
                        System.out.print("Enter Balance: ");
                        int balance = scanner.nextInt();

                        if ("Current".equalsIgnoreCase(accountType)) { //checks if the accountType is equal to Current
                            System.out.print("Enter minimum Balance: ");
                            int minbalance = scanner.nextInt();
                            //creates new object of CurAccount class to Account class reference
                            accounts[accountCount] = new CurAccount(customerName, accountNumber, balance, minbalance);
                        } else if ("Savings".equalsIgnoreCase(accountType)) { //checks if the accountType is less than Savings
                            System.out.print("Enter Interest: ");
                            double interest = scanner.nextDouble();
                            //creates new object of SavAccount class to Account class reference
                            accounts[accountCount] = new SavAccount(customerName, accountNumber, balance, interest);
                        } else {
                            System.out.println("Invalid account type. Please enter either Current or Savings.");
                            continue;
                        }
                        accountCount++; //increase accountCount
                        System.out.println("Account created successfully.");
                    } else {
                        System.out.println("Maximum number of accounts reached. Cannot create a new account.");
                    }
                    break;

                case 2:
                    performTransaction(accounts, accountCount, "deposit"); //calls method to deposite money
                    break;

                case 3:
                    performTransaction(accounts, accountCount, "withdraw"); //calls method to withdraw money
                    break;

                case 4:
                    performInterestTransaction(accounts, accountCount); //calculate interest based on balance
                    break;

                case 5:
                    performPenaltyTransaction(accounts, accountCount); //calculate penalty
                    break;

                case 6:
                    System.out.print("Enter account number to display balance: ");
                    int accNumber = scanner.nextInt();
                    displayBalance(accounts, accountCount, accNumber); //display Balance particular account
                    break;

                case 7:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    //method to perform transactions like deposit & withdraw
    static void performTransaction(Account[] accounts, int accountCount, String transactionType) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        //creates account type reference and hold the find account details
        Account account = findAccount(accounts, accountCount, accountNumber);

        if (account != null) { //if the value is not null then true

            System.out.print("Enter amount to " + transactionType + ": ");
            double amount = scanner.nextDouble();

            if ("deposit".equalsIgnoreCase(transactionType)) {
                account.deposit(amount); //deposit amount
            } else if ("withdraw".equalsIgnoreCase(transactionType)) {
                account.withdraw(amount); //withdraw amount
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    static void performInterestTransaction(Account[] accounts, int accountCount) { //method to compute Balance on interests
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        //creates account type reference and hold the find account details
        Account account = findAccount(accounts, accountCount, accountNumber);

        if (account != null) { //if the value is not null then true
            System.out.print("Enter interest rate: ");
            double interestRate = scanner.nextDouble();
            account.computeAndDepositInterest(interestRate); //calculate balance based upon Interest
        } else {
            System.out.println("Account not found.");
        }
    }

    static void performPenaltyTransaction(Account[] accounts, int accountCount) { //method to perform penalty on balance
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        //creates account type reference and hold the find account details
        Account account = findAccount(accounts, accountCount, accountNumber);
        if (account != null) { //if the value is not null then true
            System.out.print("Enter minimum balance: ");
            double minBalance = scanner.nextDouble();
            System.out.print("Enter penalty amount: ");
            double penalty = scanner.nextDouble();

            account.checkMinimumBalance(minBalance, penalty); //check minimum balance and calculate penalty based upon Balance
        } else {
            System.out.println("Account not found.");
        }
    }

    static void displayBalance(Account[] accounts, int accountCount, int accountNumber) { //method to display Balance of account
        Account account = findAccount(accounts, accountCount, accountNumber); //find account details
        if (account != null) { //if the value is not null then true
            account.displayBalance(); //calls the method to display balance of Account class
        } else {
            System.out.println("Account not found.");
        }
    }

    static Account findAccount(Account[] accounts, int accountCount, int accountNumber) { //method to find Account and return account details
        for (int i = 0; i < accountCount; i++) { //runs loop upto all account object
            if (accounts[i].getAccountNumber() == accountNumber) { //if account number matches
                return accounts[i]; //return that account details
            }
        }
        return null;
    }
}

/* OUTPUT:
----------

Enter no. of accounts:- 
2

----- Bank Menu -----
1. Create a new account
2. Deposit
3. Withdraw
4. Compute and deposit interest
5. Check minimum balance and impose penalty
6. Display balance
7. Exit
Enter your choice: 1
Enter customer name: Abhishek
Enter account number: 456456456
Enter account type (Current/Savings): Current
Enter Balance: 1800000
Enter minimum Balance: 1000
Account created successfully.

----- Bank Menu -----
1. Create a new account
2. Deposit
3. Withdraw
4. Compute and deposit interest
5. Check minimum balance and impose penalty
6. Display balance
7. Exit
Enter your choice: 1
Enter customer name: Ranvir
Enter account number: 789789789
Enter account type (Current/Savings): Savings
Enter Balance: 2200000
Enter Interest: 3.5
Account created successfully.

----- Bank Menu -----
1. Create a new account
2. Deposit
3. Withdraw
4. Compute and deposit interest
5. Check minimum balance and impose penalty
6. Display balance
7. Exit
Enter your choice: 2
Enter account number: 456456456
Enter amount to deposit: 50000
Deposit successful. Updated balance: 1850000.0

----- Bank Menu -----
1. Create a new account
2. Deposit
3. Withdraw
4. Compute and deposit interest
5. Check minimum balance and impose penalty
6. Display balance
7. Exit
Enter your choice: 3
Enter account number: 789789789
Enter amount to withdraw: 150000
Withdrawal successful. Updated balance: 2050000.0

----- Bank Menu -----
1. Create a new account
2. Deposit
3. Withdraw
4. Compute and deposit interest
5. Check minimum balance and impose penalty
6. Display balance
7. Exit
Enter your choice: 5
Enter account number: 456456456
Enter minimum balance: 500
Enter penalty amount: 100
Minimum balance maintained. No penalty.

----- Bank Menu -----
1. Create a new account
2. Deposit
3. Withdraw
4. Compute and deposit interest
5. Check minimum balance and impose penalty
6. Display balance
7. Exit
Enter your choice: 4
Enter account number: 789789789
Enter interest rate: 3.5
Interest computed and deposited. Updated balance: 2121750.0

----- Bank Menu -----
1. Create a new account
2. Deposit
3. Withdraw
4. Compute and deposit interest
5. Check minimum balance and impose penalty
6. Display balance
7. Exit
Enter your choice: 6
Enter account number to display balance: 456456456
Account Holder: Abhishek
Account Number: 456456456
Account Type: Current
Balance: 1850000.0

----- Bank Menu -----
1. Create a new account
2. Deposit
3. Withdraw
4. Compute and deposit interest
5. Check minimum balance and impose penalty
6. Display balance
7. Exit
Enter your choice: 7
Exiting the program. Goodbye!

 */