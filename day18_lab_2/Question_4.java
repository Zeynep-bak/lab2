package day18_lab_2;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		/*Write a program that asks user for the number of males and the number of females
		 *  registered in a class. 
		 * The program should display the percentage of males and females in the class.
		 */
        
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number of males: ");
		int malesNumber=scan.nextInt();
		
		System.out.println("Enter number of females: ");
		int femalesNumber= scan.nextInt();
		
		System.out.println("Percentage of males: "+malesNumber*100/(malesNumber+femalesNumber));
		System.out.println("Percentage of females: "+ femalesNumber*100/(malesNumber+femalesNumber));
		
		
		
		
		
		
		
		
		
		
	}

}
