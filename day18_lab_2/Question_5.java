package day18_lab_2;

import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		/*Write a program that computes the tax and tip on a restaurant bill.
		 *  The program should ask the user to enter the charge for the meal. 
		 *  The tax should be 6.75 percent of the meal charge.
		 *   The tip should be 20 percent of the total after adding tax.
		 *  Display the meal charge, tax amount, tip amount, and total bill on the screen.
*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter meal charge : ");
		
		int mealCharge = scan.nextInt();
		double tax = mealCharge*6.75/100;
		double tip = (tax+mealCharge)*20/100;
	System.out.println("The meal charge :$"+mealCharge+" The tax amount:$"+tax+" The tip amount:$"+tip);
		
		
		
		
		
	}

}
