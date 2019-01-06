/*
 * Find the last occurance of an integer in a sorted integer array where the array has probably duplicate items
 */
public class LastOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,2,2,3,3,4,4};
		int k = 3; // we have to find the 1st occuarnce of 3 in the array.
		int left = 0, right = arr.length - 1;
		lastOccurance(arr, left, right, k);
	}
	private static void lastOccurance(int[] A, int left, int right, int data) {
		// TODO Auto-generated method stub
		if(right>=left) {	
			int mid = (left+right)/2;
			if((mid == A.length-1 || data < A[mid+1]) && A[mid] == data){
				System.out.println(mid);
			}
			if(data<A[mid]) {
				lastOccurance(A, left, mid-1, data);
			}
			else {
				lastOccurance(A, mid+1, right, data);
			}
		}
		
	}
	

}
