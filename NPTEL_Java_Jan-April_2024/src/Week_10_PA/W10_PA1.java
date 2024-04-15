package Week_10_PA;

import java.util.Scanner;

public class W10_PA1
{
   public static void printArray(int[] array){
    
        // Iterating using for loops
        for (int i = 0; i < array.length; i++) {
            
        	System.out.print(array[i] + " ");
        }       
    }
   
   //code to sort the elements of an array in ascending order.

   public static void sortArray(int[] array){
  
	   for(int i = 1; i < array.length; i++){
		   for(int j = 0; j < array.length; j++){
      
			   if(array[j] > array[i]){
        
				   int temp = array[j];
				   array[j] = array[i];
				   array[i] = temp;       
        
			   }        
		   } 
	   }    
}
public static void main(String... a){
            
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] array = new int[size];
        int i;
        for (i = 0; i < size; i++) {
            array[i] = s.nextInt();
        }
        
        sortArray(array);
        
        // Displaying elements of array after sorting
         System.out.println("Elements of array sorted in ascending order:");
         
         printArray(array);
    }
}