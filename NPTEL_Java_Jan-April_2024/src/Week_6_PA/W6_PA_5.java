package Week_6_PA;

import java.util.*;
public class W6_PA_5{
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
        int n = inr.nextInt();
        // Add the necessary code in the below space
        
        for (int j = 1; j <= n; j++){        
          	
          	for (int i = 0; i <= n - j ; i++) {
           
                System.out.print("*");
            }            
            
                System.out.println();                
            }


		for (int j = 1; j <= n -1; j++) {        
          
          	for (int i = 1; i <= j + 1; i++){ 
            
                System.out.print("*");                
            }
          
                System.out.println();                
         }
    }
}