package Week_8_PA;

import java.util.Scanner;
class W8_PA2
{
public static void main(String... a)
    {        
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
//TODO code to generate harmonic series using while loops.
        
        double result = 0.0;
        
		while(num > 0)
        {
        	result = result + (double) 1 / num;
           
         	num--;          
          
          }
        
        System.out.print("Output of Harmonic Series is " + result);
}
}