package day18_lab_2;

import java.util.Scanner;

public class Questin_1 {

	public static void main(String[] args) {
		//Write a program with a loop that lets the user enter a series of integer numbers.
		//After all the numbers have been entered,
		//the program should display the largest and smallest numbers entered.
      
		int smallestNumber;
		int largestNumber;
		int currentNumber;
		System.out.println("Enter your first number:" );
		
		Scanner sc= new Scanner(System.in);
		currentNumber=sc.nextInt();
		largestNumber=currentNumber;
		smallestNumber=currentNumber;
		
		System.out.println("Enter next number:");
		currentNumber=sc.nextInt();
		
		if(currentNumber>largestNumber) {
			largestNumber=currentNumber;
		}
		if(currentNumber<largestNumber) {
			smallestNumber=currentNumber;
		}
		while(true) {
			System.out.println("Do you want to ccontinue   1-------0");
		     int yesOrno= sc.nextInt();
		     
		     if(yesOrno == 1) {
		    	 askForNextNumber();
		    	 System.out.println("Enter next number:");
		    	 currentNumber = sc.nextInt();
		    		if(currentNumber>largestNumber) {
		    			largestNumber=currentNumber;
		    		}
		    		if(currentNumber<largestNumber) {
		    			smallestNumber=currentNumber;
		    		}
		     }
		    	if(yesOrno == 0) {
		            	System.out.println("largestNumber "+largestNumber+" smallestNumber "+smallestNumber); 
		            	break;
		            
		     }
		}
	
	}
	
	private static void askForNextNumber() {
		// TODO Auto-generated method stub
		
	}
			
		
	}


