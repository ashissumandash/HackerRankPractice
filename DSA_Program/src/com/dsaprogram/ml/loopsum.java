package com.dsaprogram.ml;
import java.util.Scanner;

public class loopsum {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many grades to publish");
		int gradecount=sc.nextInt();
		
		int gradesum=0;
		
		for(int i=0;i<gradecount;i++)
		{
			System.out.println("Enter grade" +i+"-->");
			int gradevalue=sc.nextInt();
			gradesum += gradevalue;
		}
		
		System.out.println("Sum of all grades are: " + gradesum);
		
	}

}
