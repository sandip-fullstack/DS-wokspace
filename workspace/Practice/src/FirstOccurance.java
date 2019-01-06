/*
 * Find the 1st occurance of an integer in a sorted integer array where the array has probably duplicate items
 */
public class FirstOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,2,2,3,3,4,4};
		int k = 3; // we have to find the 1st occuarnce of 3 in the array.
		int left = 0, right = arr.length - 1;
		firstOccrance(arr, left, right, k);
	}
	private static void firstOccrance(int[] A, int left, int right, int data) {
		// TODO Auto-generated method stub
		if(right>=left) {	
			int mid = (left+right)/2;
			
			if((mid == 0 || data > A[mid-1]) && A[mid] == data){
				System.out.println(mid);
			}
			if(data>A[mid]) {
				firstOccrance(A, mid+1, right, data);
			}
			else {
				firstOccrance(A, left, mid-1, data);
			}
		}
		
	}
	

}
