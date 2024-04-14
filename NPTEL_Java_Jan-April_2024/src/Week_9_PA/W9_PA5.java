package Week_9_PA;

import java.util.Scanner;

public class W9_PA5 {

    public static void main(String[] args) {
        
    	int a, b;
        Scanner input = new Scanner(System.in);
        
        // Read any two values for a and b.
        // Get the result of a/b;
        
        int result;

        a = input.nextInt();
        b = input.nextInt();
        input.close();
        
        // try block to divide two numbers and display the result
        try {
            result = a / b;
            System.out.println(result);
        }
        // catch block to catch the Error
		catch(ArithmeticException e){
          
          System.out.print("Cannot Divide by ZERO");         
          
		}
        catch (Exception e) {
            System.out.println("Exception Occured");
        }
    }
}