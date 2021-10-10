package com.dsaprogram.ml;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class LeftRotation {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n;
		int d;
		n=sc.nextInt();
		d=sc.nextInt();
//		ArrayList<Integer> list=new ArrayList<Integer>();
		int[] array=new int[n];
		
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
		
		for(int i=0;i<array.length;i++){
		
			array[i]=sc.nextInt();
		}
		
//		d=sc.nextInt();
//		
//		for(int i=0;i<d;i++){
//			
//		}
		
		//Collections.sort(list);
		
	       //Rotate the given array by n times toward left  
        for(int i = 0; i < d; i++){  
            int j, first;  
            //Stores the first element of the array  
            first = array[0];  
            for(j = 0; j < array.length-1; j++){  
                //Shift element of array by one  
                array[j] = array[j+1];  
            }  
            //First element of array will be added to the end  
            array[j] = first;  
        }  
		
			for(int k=0;k<array.length;k++){
				System.out.print(array[k]+ " ");
			}
			
		
	}
	

}
