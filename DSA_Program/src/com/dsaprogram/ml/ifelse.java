package com.dsaprogram.ml;

import java.util.*;

public class ifelse {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter value");
		int Num = Integer.parseInt(sc.nextLine());
		 if(Num < 10){
			 System.out.println("Number is less than 10");
		 }else{
			 System.out.println("Number is greater than or equal to 10");
		 }
		
	}

}

