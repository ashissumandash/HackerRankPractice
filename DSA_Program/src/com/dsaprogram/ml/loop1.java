package com.dsaprogram.ml;
import java.util.Scanner;

public class loop1 {
	
	public static void main(String[] args)
	{
			Scanner sc=new Scanner (System.in);
			int number=sc.nextInt();
			int result;
			
			for(int i=1;i<=10;i++)
			{
				result=number*i;
				System.out.printf("%d x %d = %d%n",number,i,result);
			}
			
	}

}
