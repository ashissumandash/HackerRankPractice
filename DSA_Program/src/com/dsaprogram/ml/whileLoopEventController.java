package com.dsaprogram.ml;
import java.util.Scanner;

public class whileLoopEventController {
	
	public static void main(String[] args){
		
		//int pin=0;
		Scanner sc= new Scanner (System.in);
		String password="";
		
		//while(pin != 1234)
		while(!password.equals("openNow"))
		{
			System.out.println("Please enter your pin");
			//pin=sc.nextInt();
			password=sc.nextLine();
			//if(pin==1234)
			//	System.out.println("PIN is correct");
			
			if(password.equals("openNow"))
				System.out.println("Correct password");
			//else
			//	System.out.println("PIN is wrong, please try again");
			else
				System.out.println("Incorrect password, please try again");
		}
		
		System.out.println("Transaction completed");
	}

}
