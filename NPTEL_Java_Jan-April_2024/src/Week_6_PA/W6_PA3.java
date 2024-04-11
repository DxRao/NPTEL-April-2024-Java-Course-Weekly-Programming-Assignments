package Week_6_PA;

import java.util.Scanner;
public class W6_PA5{
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int num =sc.nextInt();
	   //Use while or for loop to find the factors of a number.

		for (int i = 1; i <= num; i++) {      
     
      		if (num % i == 0) {
        
        	System.out.print(i + " ");
              
            }        
      	}
    }
}