package com.dsaprogram.ml;

import java.util.Scanner;

public class OutputFormatting {
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
        	//char[10] c=sc.next().charAt(0);
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d\n", s1, x);
        }
        System.out.println("================================");
	}
	

}
