package Week_9_PA;

import java.util.*;

public class W9_PA3 {
    public static void main(String[] args) {
        
    	try {
            byte byte_array[] = {
                'N', 'P', 'T', 'E', 'L', ' ', 
                '-', ' ', 
                'P', 'R', 'O', 'G', 'R', 'A', 'M', 'M', 'I', 'N', 'G', ' ', 
                'I', 'N', ' ', 
                'J', 'A', 'V', 'A'};
            Scanner inr = new Scanner(System.in);
            int n = inr.nextInt();
            inr.close();
            // print the required output
            // close try and add a catch block for index out of bounds
			//if(n < 0){              
              //System.out.print("Array index is out of range");              
            //}

			char ch =' ';

			for(int i = 0; i <= n+1; i++){            	
                
              	ch = (char)byte_array[n];
              
              	if(i == n){
                
              	System.out.print("byte_array[" + n + "] = "+ "'" + ch + "'");                
              
            	}              	
            }//for
         }//try
		catch(ArrayIndexOutOfBoundsException ae){
             
            System.out.print("Array index is out of range");              
        }
		catch(NegativeArraySizeException ne){
              
            System.out.print("Array index is out of range");              
        }  
    	catch (Exception e) {
            
    		System.out.println("Exception occurred");
        }
    }
}