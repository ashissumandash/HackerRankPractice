//question: 

//In this program, we need to count each character present in the string and find out the maximum and minimum occurring character.
//String: Grass is greener on the other side  

/*Algo:
1. Define a string
2. Declare an array having same size as of string and store count of unique character based on their index
3. MinChar = minimum Character and maxChar = maximum character occurrence. Initialized as first character present in the string.
4. two loops:
 				Outer loop select the character and initialize the index
 				Inner loop compare the selected character with other character and increase the frequency if found
*/
package com.dsaprogram.ml;

public class CharacterOccurrence {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		
		String str="Grass is greener on the other side";
		int[] freq=new int[str.length()];
		System.out.println("freq value: " +freq);
		char minChar=str.charAt(0),maxChar=str.charAt(0);
		System.out.println("minChar value: " +minChar);
		System.out.println("maxChar value: " +maxChar);
		int i,j,min,max;
		
		//convert given string to character array
		char string[]=str.toCharArray();
		
		//count each word in given string and store in array freq
		for(i=0;i<string.length;i++)
		{
			freq[i]=1;
			for(j=i+1;j<string.length;j++)
			{
				System.out.println("without if condition");
				System.out.println("string i: " +i);
				System.out.println("string j: " +j);
				System.out.println("string freq[i]: " +freq[i]);
				System.out.println("string String[i]: " +string[i]);
				System.out.println("string String[j]: " +string[j]);
				System.out.println("string length: " +string.length);
				
				if(string[i]==string[j] && string[i]!=' ' && string[i]!='0')
				{
					System.out.println("if condition: ");
					freq[i]++;
					System.out.println("string i: " +i);
					System.out.println("string j: " +j);
					System.out.println("string freq[i]: " +freq[i]);
					System.out.println("string String[i]: " +string[i]);
					System.out.println("string String[j]: " +string[j]);
					System.out.println("string length: " +string.length);
					//set string [j] to 0 to avoid storing last visited character
					string[j]='0';
				}	
			}
			
		}
		
		
        //Determine minimum and maximum occurring characters  
        min = max = freq[0];  
        System.out.println("print min,max,freq[0]: " +min);
        for(i = 0; i <freq.length; i++) {  
              
        	System.out.println("without if");
        	System.out.println("freq length: " +freq.length);
        	System.out.println("i value: " +i);
        	System.out.println("freq[i]: " +freq[i]);
            //If min is greater than frequency of a character   
            //then, store frequency in min and corresponding character in minChar  
            if(min > freq[i] && freq[i] != '0') {  
                min = freq[i];  
                minChar = string[i];  
                System.out.println("with if min: ");
                System.out.println("print min,freq[i]: " +min);
                System.out.println("print minChar, string[i]: " +minChar);
            }  
            //If max is less than frequency of a character   
            //then, store frequency in max and corresponding character in maxChar  
            if(max < freq[i]) {  
                max = freq[i];  
                maxChar = string[i];  
                System.out.println("with if max: ");
                System.out.println("print max,freq[i]: " +max);
                System.out.println("print maxChar, string[i]: " +maxChar);
            }  
        }  
		
        System.out.println("Minimum occurring character: " + minChar);  
        System.out.println("Maximum occurring character: " + maxChar);
		
		
	}
	
}

