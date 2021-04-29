package day18_lab_2;

import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {
		/*Write a program that will ask the user to enter the amount of a purchase.
		 *  The program should then compute the state and county tax sales tax.
		 *   Assume the state sales tax is 4 percent and the county sales tax is 2 percent.
		 *    The program should display the amount of the purchase , the state sales tax, 
		 *    the county sales tax, the total sales tax, and the total of the sale 
		 * (which is the sum of the amount of purchase plus the total sales tax)
        */
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the amount of a purchase:");
	
	int purchase = scan.nextInt();
	double stateTax = purchase*4/100;
	double countryTax = purchase*2/100;
	
	System.out.println("The amount of the purchase:$"+purchase+" The state sales tax:$"+stateTax+
			" The country sales tax:$"+countryTax+" The total sales tax:$"+(stateTax+countryTax)+
			" Total of the sale :$"+(purchase+stateTax+countryTax));
	
	
	
	
	}

}
