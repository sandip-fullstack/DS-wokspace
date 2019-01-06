import java.util.Arrays;

/**
 * Given a boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] 
 * is 1 (or true) then make all the cells of ith row and jth column as 1.
 * @author pals
 *
 */
public class MatrixMakeOne {
public static void main(String[] args) {
	int mat[][] = new int[][] {
		{1, 0, 0, 1},
		{0, 0, 1, 0},
		{0, 0, 0, 0}
	};
	System.out.println("Input matrix is ");
	printMatrix(mat);
	modifyMatrix(mat);
	System.out.println();
	System.out.println("Output matrix is ");
	
}

private static void printMatrix(int[][] mat) {
	// TODO Auto-generated method stub
	for(int i=0;i<3;i++) {
		for(int j=0;j<4;j++) {
			System.out.print(mat[i][j] + " ");
		}
		System.out.println();
	}
}
private static void modifyMatrix(int[][] mat) {
	int row[] = new int[3];
	int col[] = new int[4];
	Arrays.fill(row, 0);
	Arrays.fill(col, 0);
	for(int i=0;i<row.length;i++) {
		for(int j=0;j<col.length;j++) {
			if(mat[i][j] == 1) {
				row[i] = 1;
				col[j] = 1;
			}
		}
	}
	 for (int i = 0; i < 3; i++)
	    {
	        for (int j = 0; j < 4; j++)
	        {
	            if ( row[i] == 1 || col[j] == 1 )
	            {
	                mat[i][j] = 1;
	            }
	        }
	    }
	 printMatrix(mat);
}
}
