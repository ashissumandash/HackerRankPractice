package com.dsaprogram.ml;
import java.util.Scanner;

public class TwoDarray {
	
	public static void main(String[] args){
		
		int[][] arr=new int[3][3];
		Scanner sc=new Scanner(System.in);
		
		try{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("Enter number to array: ");
				arr[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		}
		catch(Exception e){
			System.out.println("Please Enter only interger");
		}
		
			
		System.out.println("Output of 2D array: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
	
	

}
