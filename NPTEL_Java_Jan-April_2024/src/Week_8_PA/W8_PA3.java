package Week_8_PA;

import java.util.*;

public class W8_PA3{
    public static void main(String args[]) {
        int array[][] = new int[5][5];
        int i, j;
        double sum = 0, square = 0, result = 0;
        Scanner s = new Scanner(System.in);
 
        // reads number of rows from the user
        int row = s.nextInt();

        // reads number of columns from the user
        int column = s.nextInt();
        for (i = 0; i < row; i++) {
            // loop for columns
            for (j = 0; j < column; j++) {
                // reads the matrix elements
                array[i][j] = s.nextInt();
                // prints space
               // System.out.print(" ");
            }
        }
// Input 2D matrix using Scanner Class 
//Calculate the trace of the matrix


		for(i = 0; i < row; i++)
  	    {  
    	    for(j = 0; j < column; j++)
       	    {
                if(i == j)
            	 {
               	     sum = sum + (array[i][j]);
               	 }
            }
        }

        System.out.print(sum);
} 
}