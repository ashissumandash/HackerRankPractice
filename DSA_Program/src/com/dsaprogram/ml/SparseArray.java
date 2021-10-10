package com.dsaprogram.ml;

import java.util.Scanner;
import java.io.*;

public class SparseArray {

public static void binarySearch(String arr[],String key[]){
		
	
	
	for(int j=1;j<key.length;j++){
		int count=0;
		for(int i=0;i<arr.length;i++){
		
		if((key[j].compareTo(arr[i])) == 0){
			//System.out.println("found at the index: "+i);
			
			//System.out.println("Key to find "+key[j]);
			//System.out.println("Input string found: "+arr[i]);
			//System.out.println(arr[i]+ "found at the index: "+i);
			//break;
			count++;
			//System.out.println("count at the index: "+count);
		}
		else if(key[j].compareTo(arr[i]) < 0){
			//System.out.println(key[j]+ "Element not found at : "+i);
			//System.out.println(arr[i]+ "Element not found at: "+i);
		}
		else{
			//System.out.println(key[j]+ "Element not found at : "+i);
			//System.out.println(arr[i]+ "Element not found at: "+i);
		}
		
		}
		System.out.println("\n\n"+count);
	}
	
	//System.out.println("Counter value: "+count);
	
	
	
	}
	
	
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner (System.in);
		//System.out.println("Enter how many string you want to give as input: ");
		int newstring=sc.nextInt();
		String[] arr=new String[newstring+1];

		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextLine();
			//System.out.println(i +"Enter String please: ");
		}
		
		//System.out.print("Enter how many string to find: ");
		int stringfind=sc.nextInt();
		String[] key=new String[stringfind+1];
		
		for(int l=0;l<key.length;l++){
			key[l]=sc.nextLine();
			//System.out.println(l+ " find string as input: ");
			
		}
		
		//String key="geeks";
		binarySearch(arr,key);
		
	}
	
	
}
