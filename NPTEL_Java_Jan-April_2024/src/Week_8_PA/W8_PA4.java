package Week_8_PA;

import java.util.Scanner;

public class W8_PA4{

//TODO code to remove duplicates from sorted array

	public static int removeDuplicates(int a[]){            
  
  		int n = a.length;
  
  		if (n == 0 || n == 1) {
          
            return n;
        } 
       
        int[] temp = new int[n];
        int j = 0;
 
        for (int i = 0; i < n - 1; i++) {
          
            if (a[i] != a[i + 1]) {
              
                temp[j++] = a[i];
            }
        }
 
        temp[j++] = a[n - 1]; 
        
        for (int i = 0; i < j; i++) {
          
            a[i] = temp[i];
        }
 
        return j;
    }
	public static void main(String... a){
            
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] array = new int[size];
        int i;
        for (i = 0; i < size; i++) {
            array[i] = s.nextInt();
        }
        
        int index = removeDuplicates(array);
        for(i=0; i<index; i++){
            System.out.print(array[i] + " ");
        }
    }
}