/*
 * Let A be an array of distinct integers. Find the index k, whose left portion is monotonically increasing sequence and
 * right portion is monotonically decreasing
 * */
public class FindIndexIncreaseAndDecrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,6,5,4,3,2,1}; // 7 is the number
		int low = 0;
		int high = arr.length - 1;
		int index = findIndex(arr, low, high);
		System.out.println(index);
	}

	private static int findIndex(int[] arr, int low, int high) {
		int mid=0;
		while(low<=high) {
			mid = (low+high)/2;
			if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1])
				return mid;
			else if(arr[mid-1]<arr[mid] && arr[mid]<arr[mid+1])
				low = mid+1;
			else if(arr[mid-1]>arr[mid] && arr[mid]>arr[mid+1])
				high = mid -1;
			else
				return Integer.MIN_VALUE;
		}
		return mid;
		// TODO Auto-generated method stub
		
	}

}
