// program to read various data types and printing it

package com.dsaprogram.ml;

import java.util.Scanner;

public class datatypes {
	
	public static void main(String[] args){
		//Declare the object and initialize
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Kindly enter your name: ");
		//String input
		String name = sc.nextLine();
		System.out.println("Kindly enter your Gender: ");
		//Character input
		char gender=sc.next().charAt(0);
		System.out.println("Kindly enter your Age: ");
		//numerical data input
		int age=sc.nextInt();
		System.out.println("Kindly enter your cell number");
		//byte, short, float can be used;
		long mobileno=sc.nextLong();
		System.out.println("Kindly enter your CGPA");
		//Double
		double cgpa=sc.nextDouble();
		
		//Print the values to check input was correct or not
		System.out.println("Name: " +name);
		System.out.println("Gender: " +gender);
		System.out.println("age: " +age);
		System.out.println("Mobileno: " +mobileno);
		System.out.println("cgpa: " +cgpa);
		
		int sum=0,count=0;
		
		while(sc.hasNextInt()){
			
			int num=sc.nextInt();
			sum=sum+num;
			count++;
		}
		
		int mean= sum/count;
		System.out.println("mean value: " +mean);
	}

}
