package day18_lab_2;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		/*Write a program that asks the user for a positive nonzero integer value.
		 *  The program should use a loop to get the sum of all the integers from 1 up to the number
		 *   entered. 
		*/
	
		Scanner scan = new Scanner(System.in);
		 System.out.println("Enter number :");
		
		 int number = scan.nextInt();
		 int sumOfNumbersFromOne=0 ;
		 while(number>0) {
			 sumOfNumbersFromOne+=number;
			 number--;
		 
		 }
		
	
	 System.out.println("Sum of 1 to enter number is :" +sumOfNumbersFromOne);	
	}
}
