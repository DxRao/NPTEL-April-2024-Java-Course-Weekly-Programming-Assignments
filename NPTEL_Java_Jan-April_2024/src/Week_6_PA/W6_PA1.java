package Week_6_PA;

import java.util.Scanner;
public class W6_PA1{
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int x=sc.nextInt();
	   int y=sc.nextInt();
//code for quotient and remainder

	   int quotient = 0, remainder = 0;  
  
      
	   quotient = x / y;  
  
	   remainder = x % y;  
    
	   System.out.println("The Quotient is = " + quotient);  
    
	   System.out.print("The Remainder is = " + remainder); 
       }
}
