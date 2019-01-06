
public class FindInSortedRowCol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50} };
				search(mat, 4, 29);
	}

	private static void search(int[][] mat, int n, int x) {
		// TODO Auto-generated method stub
		int i=0, j=n-1;
		while(i<mat.length && j>=0) {
			if(mat[i][j] ==x) {
				System.out.println("found at "+ i +" "+ j);
				return;
			}
			else if(x > mat[i][j]) {
				i++;
			}
			else j--;
		}
	}

}
