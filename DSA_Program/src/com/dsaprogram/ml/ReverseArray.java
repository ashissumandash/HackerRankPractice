package com.dsaprogram.ml;
import java.util.*;

public class ReverseArray {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter "+size+ " values in this array");
		for(int x=0;x<size;x++)
		{
			arr[x]=sc.nextInt();
		}
		
	//	System.out.println("Original array: ");
		
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}*/
		//System.out.println("");
		//int k=arr.length-1;
		for(int j=0;j<arr.length;j++)
		{
			size--;
			System.out.print(arr[size] +" ");
			
		}
	}

}
