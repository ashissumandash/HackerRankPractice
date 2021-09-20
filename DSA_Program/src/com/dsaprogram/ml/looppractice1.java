package com.dsaprogram.ml;

public class looppractice1 {
	
	public static void main(String[] args){
		
		String word= "arllra";
		
		for (int i=0;i<word.length();i++)
		{
			System.out.print(word.charAt(i));
		}
		
		System.out.print("\n");
		for (int j=word.length()-1;j>=0;j--)
		{
			System.out.print(word.charAt(j));
		}
		System.out.print("\n");
		int len=word.length()-1;
		for(int k=0;k<=word.length()-1;k++)
		{
			System.out.print(word.charAt(len-k));
			//len=len-1;
		}
		System.out.print("\n");
		
		
		
	}

}
