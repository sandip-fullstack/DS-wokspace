
public class MinInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 6,7,8,9,1,2,3,4};
		int l = 0;

				// index of last element.
				int h = arr.length - 1;

				// always restrict the search to the unsorted 
				// sub-array. The min is always there.
				while (arr[l] > arr[h]) {
				        // find mid.
				        int mid = (l + h)/2;
				        // decide which sub-array to continue with.
				        if (arr[mid] > arr[h]) {
				                l = mid + 1;
				        } else {
				                h = mid;
				        }
				}
				// answer
				System.out.println(arr[l]);
	}

}
