/*ProblemNo_2.10)A company has four salespeople (1 to 4) who sell five different products (1 to 5). Once a
day, each salesperson passes in a slip for each different type of product sold. Each slip
contains:
* The salesperson number
* The product number
* The total dollar value of that product sold that day

Thus, each salesperson passes in between 0 and 5 sales slips per day. Assume that the
information from all of the slips for last month is available. Write a program that will
read all this information for last month’s sales and summarize the total sales by
salesperson by product. All totals should be stored in the double-subscripted array sales.
After processing all the information for last month, print the results in tabular format with
each of the columns represent a particular salesperson and each of the rows representing a
particular product. Cross total each row to get the total sales of each product for last
month, and cross total each column to get the total sales by salesperson for last month.
Your tabular printout should include these cross totals to the right of the totaled rows and
to the bottom of the totaled columns.*/

package _1_intro_to_java;

import java.util.Scanner;

public class Problem20 {

	public static void main(String[] args) {
		// Declare and initialize the two-dimensional array to store the total sales by
		// salesperson by product
		double[][] sales = new double[5][5];

		// Read the sales information from the console
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int salespersonNumber = scanner.nextInt();
			int productNumber = scanner.nextInt();
			double totalSales = scanner.nextDouble();

			sales[salespersonNumber - 1][productNumber - 1] += totalSales;
		}

		// Calculate the cross totals for each row and column
		double[] rowTotals = new double[5];
		double[] columnTotals = new double[5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				rowTotals[i] += sales[i][j];
				columnTotals[j] += sales[i][j];
			}
		}

		// Print the results to the console
		System.out.println("Sales Summary");
		System.out.println("-------------");
		System.out.println("Salesperson | Product 1 | Product 2 | Product 3 | Product 4 | Product 5 | Total");
		System.out.println("----------|------------|------------|------------|------------|------------|------------");
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + " | ");
			for (int j = 0; j < 5; j++) {
				System.out.print(sales[i][j] + " | ");
			}
			System.out.println(rowTotals[i]);
		}
		System.out.println("Total | " + columnTotals[0] + " | " + columnTotals[1] + " | " + columnTotals[2] + " | "
				+ columnTotals[3] + " | " + columnTotals[4] + " | ");
	}
}