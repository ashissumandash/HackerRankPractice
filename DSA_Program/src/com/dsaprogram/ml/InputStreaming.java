package com.dsaprogram.ml;

import java.util.*;

public class InputStreaming {
	 public static void main(String[] args){
		 
		 int firstNum, secondNum, result;
		 Scanner sc= new Scanner (System.in);
		 System.out.println("Enter the first number:");
		 firstNum= Integer.parseInt(sc.nextLine());
		 System.out.println("Enter second number:");
		 secondNum= Integer.parseInt(sc.nextLine());
		 result = firstNum*secondNum;
		 System.out.println("Result will be:");
		 System.out.println(result);
		 
	 }
	

}
