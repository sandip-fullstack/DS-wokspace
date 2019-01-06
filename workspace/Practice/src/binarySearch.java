
public class binarySearch {

	public static void main(String[] args) {
		int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
		System.out.println("Key 14's position: "+binarySearch(arr, 14));
	}

	private static int binarySearch(int[] arr, int i) {
		// TODO Auto-generated method stub
		int key = i;
		int low = 0;
		int high = arr.length - 1;
		int mid = -1;
		while(low <= high) {
			mid = (low+high)/2;
			if(key == arr[mid]) {
				return mid;
			}
			else if(key < arr[mid]) {
				high = mid -1;
			}
			else {
				low = mid + 1;
			}
		}
		return -1;
	}
}
