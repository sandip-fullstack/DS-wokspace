
public class SearchInRotatedSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		int key = 2;
		int low = 0;
		int high = a.length - 1;
		int index = BinarySearchRotatedSorted(a,low,high,key);
		System.out.println(index);
	}

	private static int BinarySearchRotatedSorted(int[] a, int low, int high, int key) {
		// TODO Auto-generated method stub
		int mid;
		if(low>high)
			return -1;
		mid = (low+high)/2;
		if(key==a[mid])
			return mid;
		else if(a[low]<=a[mid]) // first half is sorted
		{
			if(key>=a[low] && key<a[mid])
				return BinarySearchRotatedSorted(a, low, mid-1, key);
			else
				return BinarySearchRotatedSorted(a, mid+1, high, key);
		}
		else if(a[mid]<=a[high]) // second half is sorted
		{
			if(key>a[mid] && key<=a[high])
				return BinarySearchRotatedSorted(a, mid+1, high, key);
			else
				return BinarySearchRotatedSorted(a, low, mid-1, key);
		}
		return mid;
	}

}
