package com.dsaprogram.ml;

import java.util.Scanner;
import java.io.FileWriter;

public class sorting {
	
	public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int[] array=new int[n];
		
		for(int i=0;i<n;i++){
			array[i]=sc.nextInt();
		}
		
		for(int j=0;j<array.length;j++){
			for(int k=j+1;k<array.length;k++){
				int temp=0;
				if(array[j]>array[k]){
					temp=array[j];
					array[j]=array[k];
					array[k]=temp;
				}
				
			}
			System.out.print(array[j]+" ");
		}
		
		try{
		FileWriter fw = new FileWriter("C:\\Agent_Configuration\\Sample.txt");
		fw.write("I am great");
		fw.close();
		}catch(Exception e){
		  System.out.println(e);
		}
	}

}
