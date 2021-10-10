package com.dsaprogram.ml;
import java.util.Scanner;

public class loop1 {
	
	public static void main(String[] args)
	{
			Scanner sc=new Scanner (System.in);
			int sample=sc.nextInt();
			String[] arr=new String[sample+1];

			
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextLine();
				System.out.println("Enter nth string value: "+i);
				
			}
			
			for(int j=0;j<arr.length;j++){
				
				System.out.println(arr[j]);
			}
			
	}

}
