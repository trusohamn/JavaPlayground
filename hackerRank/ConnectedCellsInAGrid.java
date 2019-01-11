package hackerrank;
import java.io.*;
import java.util.*;


public class ConnectedCellsInAGrid {

	static int[][] grid;
	static int rows;
	static int columns;

	// Complete the connectedCell function below.
	static int connectedCell(int[][] matrix) {
		grid = matrix;
		rows = grid.length;
		columns = grid[0].length;
		int max=0;
		for(int i=0; i< rows ; i++) {
			for(int j=0; j< columns; j++) {
				if(grid[i][j]==1) {
					int area = lookAround(i,j);
					//System.out.println(i + " " + j + " area" + area);
					if(area>max) max=area;
				}
			}
		}
		return max;
	}

	static int  lookAround(int i, int j) {
		if (i<0 || i>=rows || j<0 || j>=columns) return 0;
		else if (grid[i][j] == 0) return 0;

		int sum=1;
		grid[i][j]= 0;
		//System.out.println("looking " + i + " " + j + " size " + sum);
		for(int n=i-1; n<=i+1; n++) {
			for(int m=j-1; m<=j+1; m++) {
				sum = sum + lookAround(n,m);
			}
		}
		return sum;
	}
	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {


		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int m = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[][] matrix = new int[n][m];

		for (int i = 0; i < n; i++) {
			String[] matrixRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < m; j++) {
				int matrixItem = Integer.parseInt(matrixRowItems[j]);
				matrix[i][j] = matrixItem;
			}
		}

		System.out.println(connectedCell(matrix));



		scanner.close();
	}
}
