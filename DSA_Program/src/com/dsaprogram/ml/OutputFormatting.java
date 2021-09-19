package com.dsaprogram.ml;

import java.util.Scanner;

public class OutputFormatting {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("======================");
		for (int i=0;i<3;i++)
		{
			String sl=sc.next();
		//	int a=Integer.parseInt(sc.nextLine());
			System.out.printf(sl);
		}
		
		/*for (int j=0;j<3;j++)
		{
			//System.out.println(sl);
		}*/
		
		System.out.println("=====================");
	}
	

}
