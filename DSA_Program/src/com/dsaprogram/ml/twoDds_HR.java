package com.dsaprogram.ml;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;


public class twoDds_HR {
	
	public static void main(String[] args) throws Exception{
	
	int arr[][]=new int[6][6];
	Scanner sc=new Scanner(System.in);
	
	try{
	for(int i=0;i<6;i++)
	{
		for(int j=0;j<6;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	}
	}catch(Exception e){
		System.out.println("Kindly enter interger value: " +e);
	}
	
	List sum=new ArrayList();
	
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			
			sum.add(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
			
		}
	}
	
	System.out.println(Collections.max(sum));

	}

}
