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
//I did it from scratch

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Account1{
    private String name;
    private int accountNum;
    private String accountType;
    private double balance;

public Account1(String name, int accountNum, String accountType, double balance){
    this.name = name;
    this.accountNum = accountNum;
    this.accountType = accountType;
    this.balance = balance;
}

void deposit(double amt){
    balance += amt;
    System.out.println("Deposited successfully: "+ amt);
    System.out.println("Current balance: "+balance);
}

void withdraw(double amt){
    if(balance >= amt){
        balance -= amt;
        System.out.println("Withdrawal successful");
        System.out.println("Current balance: "+balance);
    }else{
        System.out.println("Insufficient balance");
    }
}

int getAccountNumber(){
    return accountNum;
}
void display(){
    System.out.println("Customer name: "+this.name);
    System.out.println("Account balance: "+this.balance);
}

}

public class AccountTest2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter number of customers: ");
        Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = sc.nextInt();

        Account1[] customer = new Account1[n];   //creating array of objects
        //Taking in Customer details
        for(int i=0; i<n; i++){
            System.out.println("Enter the details of Customer "+(i+1)+":");
            System.out.println("Enter Name: ");
            String name = reader.readLine();
//            String name = sc.nextLine();
            System.out.println("Enter Account Number: ");
            int accountNum = sc.nextInt();
            System.out.println("Enter Account Type(Savings/Current): ");
            String accountType = sc.next();
            System.out.println("Enter amount to be deposited: ");
            double balance = sc.nextDouble();

            customer[i] = new Account1(name, accountNum, accountType, balance);
        }

        //checking if the Customer is present or not
        System.out.println("Enter Account Number to search for: ");
        int accountNum = sc.nextInt();
        boolean isFound = false;
        for(int i=0; i<n; i++){
            if(customer[i].getAccountNumber() == accountNum){
                isFound = true;
                System.out.println("Account present in database");

                int choice;
                do{
                    System.out.println("What you want to do ?");
                    System.out.println("Press 1 to display name and balance");
                    System.out.println("Press 2 to deposit into account");
                    System.out.println("Press 3 to withdraw from account");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            customer[i].display();
                            break;
                        case 2:
                            double amtD = sc.nextDouble();
                            customer[i].deposit(amtD);
                            break;
                        case 3:
                            double amtW = sc.nextDouble();
                            customer[i].withdraw(amtW);
                            break;
                        default:
                            System.out.println("No such operation exists. Try after sometime");
                            break;
                    }
                }while(choice == 1 || choice == 2 || choice == 3 );
            }

        }
        if(isFound == false){
            System.out.println("Account not found");
        }

    }
}
