/*ProblemNo_2.5)The straight-line method of computing the early depreciation of the value of an item is
given by:

Depreciation = (Purchase price - Salvage value)/Years of service

Write a program to determine the salvage value of an item when the purchase price, years
of service & the annual depreciation is given.*/

package _1_intro_to_java;

import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float Depreciation,PurchasePrice,SalvageValue;
        int YearOfService;
        System.out.print("Enter Purchase Price: ");
        PurchasePrice = sc.nextFloat();
        System.out.print("Enter Depreciation value: ");
        Depreciation = sc.nextFloat();
        System.out.print("Enter Year of Service: ");
        YearOfService = sc.nextInt();
        SalvageValue = PurchasePrice-(Depreciation*YearOfService);
        System.out.println("Salvage Value is: "+ SalvageValue);
        
        sc.close();
    }
}
/*
INPUT:
------
Enter Purchase Price: 10000
Enter Depreciation value: 1000
Enter Year of Service: 5

OUTPUT:
-------
Salvage Value is: 5000.0
 */