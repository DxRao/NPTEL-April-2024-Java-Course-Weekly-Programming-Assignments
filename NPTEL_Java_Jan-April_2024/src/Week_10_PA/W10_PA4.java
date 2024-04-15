package Week_10_PA;

import java.util.Scanner;

public class W10_PA4{
	
	//Code to create function primesum(), compute the sum of all prime numbers in a given range.

	public static int primeSum(int x, int y){
  
		int sum =0;
		boolean flag = false;
  
		for(int i = x; i <= y; i++){
			for(int j = 2; j < i; j++ ){
      
				if((i % j) == 0){       
        
					flag = true;
        
					break;                
				} 
      
				else{
        
					flag = false;
				}      
      
			}//for 
    
			if(flag == false){
				
				sum = sum + i;
			}
    
		} // for
  
		return sum;  
	}
	public static void main(String[] args){
	
       Scanner sc = new Scanner(System.in);
	   int x=sc.nextInt();
	   int y=sc.nextInt();
		
	    System.out.println(primeSum(x, y));
	}
}