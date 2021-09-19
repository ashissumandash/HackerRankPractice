package com.dsaprogram.ml;

public class loopcounter {
	
	public static void main(String[] args){
		
		
		String word = "mirror";
		int counter=0;
		
		for (int i=0;i< word.length();i++)
		{
			if ( word.charAt(i)=='r')
				counter++;
		}
		
		System.out.println("Your word has "+counter+" r(s) int");
	}

}
