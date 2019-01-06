import java.util.HashMap;

public class SubArrayWithZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 2, -3, 1, 6};
		if (printZeroSumSubarray(arr))
			System.out.println("Found a subarray with 0 sum");
		else
			System.out.println("No Subarray with 0 sum"); 
	}

	private static boolean printZeroSumSubarray(int[] arr) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hM = 
				new HashMap<Integer, Integer>();

		// Initialize sum of elements
		int sum = 0;        

		// Traverse through the given array
		for (int i = 0; i < arr.length; i++)
		{   
			// Add current element to sum
			sum += arr[i];

			// Return true in following cases
			// a) Current element is 0
			// b) sum of elements from 0 to i is 0
			// c) sum is already present in hash map
			if (arr[i] == 0 || sum == 0 || hM.get(sum) != null)                            
				return true;

			// Add sum to hash map
			hM.put(sum, i);
		}
		return false;    
	}

}
