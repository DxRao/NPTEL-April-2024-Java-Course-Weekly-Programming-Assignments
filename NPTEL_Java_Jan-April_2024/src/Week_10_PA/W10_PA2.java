package Week_10_PA;

import java.util.*;

public class W10_PA2{
	//code to print a given matrix in spiral form.
	
	public static void spiral_method(int[][] matrix, int rows, int columns)
	{
		List<Integer> ans = new ArrayList<Integer>();

		if (matrix.length == 0) {
			
			System.out.println(ans);			
		}

		int m = rows, n = columns;
		boolean[][] seen = new boolean[m][n];
		int[] dr = { 0, 1, 0, -1 };
		int[] dc = { 1, 0, -1, 0 };
		int x = 0, y = 0, di = 0;
	
		for (int i = 0; i < m * n; i++) {
			ans.add(matrix[x][y]);
			seen[x][y] = true;
			int cr = x + dr[di];
			int cc = y + dc[di];

			if (0 <= cr && cr < m && 0 <= cc && cc < n	&& !seen[cr][cc]) {
				x = cr;
				y = cc;
			}
			else {
				di = (di + 1) % 4;
				x += dr[di];
				y += dc[di];
			}
		}	
      
      	for(Integer i : ans){
        
        	System.out.print(i + " ");        
      	}
	}

	public static void main(String args[]) {
        
		int i, j;
        
        Scanner s = new Scanner(System.in);
        int dimension = s.nextInt();

        int[][] spiral = new int[dimension][dimension];
        
        for (i = 0; i < dimension ; i++) {
            // loop for columns
            for (j = 0; j < dimension ; j++) {
                // reads the matrix elements
                spiral[i][j] = s.nextInt();
            }
        }
        
        spiral_method(spiral, dimension, dimension);        
    }// main
}// class