package com.dsaprogram.ml;


import java.util.*;
import java.io.*;

public class stdinstdout2 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		
		int i;
		double d;
		String s;
		
		i=Integer.parseInt(sc.nextLine());
		d=Double.parseDouble(sc.nextLine());
		s=sc.nextLine();
		//s=sc.toString();
	//	try{
	//		String s=br.readLine();
	//	}catch(Exception ie){
	//		System.out.println("no input value");
	//	}
		
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
		//System.out.println(s);
		
		
		
	}

}

