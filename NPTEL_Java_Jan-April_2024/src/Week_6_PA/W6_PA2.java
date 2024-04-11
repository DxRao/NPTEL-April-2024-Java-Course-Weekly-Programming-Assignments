package Week_6_PA;

import java.util.Scanner;
public class W6_PA2{
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int num=sc.nextInt();
	   //Use while loop to count number of digits in an integer

	   int count = 0;

	   while(num > 0){
  
		   num = num / 10;
  
		   count++;
  
	   }

	   System.out.print(count);
    }
}