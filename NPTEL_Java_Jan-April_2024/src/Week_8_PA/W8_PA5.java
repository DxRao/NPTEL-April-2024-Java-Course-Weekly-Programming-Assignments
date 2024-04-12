package Week_8_PA;

import java.util.*;

public class W8_PA5{
// Input 2D matrix using Scanner Class 
//Calculate the determinant of the matrix

	static int determinantOfMatrix(int mat[][], int n){
    
        int num1, num2, det = 1, index,
                        total = 1;  
       
        int[] temp = new int[n + 1]; 
        
        for (int i = 0; i < n; i++) {
            index = i;  
            
            while (mat[index][i] == 0 && index < n) {
                index++;
            }
            if (index == n) 
            {
                
                continue;
            }
            if (index != i) {                
                
                for (int j = 0; j < n; j++) {
                    swap(mat, index, j, i, j);
                }                
               
                det = (int)(det * Math.pow(-1, index - i));
            } 
            
            for (int j = 0; j < n; j++) {
                temp[j] = mat[i][j];
            }           
            
            for (int j = i + 1; j < n; j++) {
                num1 = temp[i]; 
                num2 = mat[j]
                          [i];                
                
                for (int k = 0; k < n; k++) {                    
                    
                    mat[j][k] = (num1 * mat[j][k])
                                - (num2 * temp[k]);
                }
                total = total * num1; 
            }
        }        
        
        for (int i = 0; i < n; i++) {
            det = det * mat[i][i];
        }
        return (det / total);
    }
 
    static int[][] swap(int[][] arr, int i1, int j1, int i2, int j2)
    {
        int temp = arr[i1][j1];
        arr[i1][j1] = arr[i2][j2];
        arr[i2][j2] = temp;
        return arr;
    }
    public static void main(String args[]) {
        int array[][] = new int[5][5];
        int i, j;
       // double sum = 0, square = 0, result = 0;
        Scanner s = new Scanner(System.in);
 
        
        int dimension = s.nextInt();

       
        for (i = 0; i < dimension ; i++) {
            // loop for columns
            for (j = 0; j < dimension ; j++) {
                // reads the matrix elements
                array[i][j] = s.nextInt();
                // prints space
               // System.out.print(" ");
            }
        }
        System.out.printf("Determinant of the matrix is : %d",
			determinantOfMatrix(array,dimension));
    } 
}