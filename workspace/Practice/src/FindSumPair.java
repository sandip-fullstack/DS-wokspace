import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*Solution to Find Pair Of Integers in Array whose Sum is Given Number*/
/*Three solutions */

public class FindSumPair {
	public static void main(String[] args) {
		int arr[] = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
		int sum = 7;
		solution1(arr, sum);
		System.out.println("use a set. Take one element(e.g 2) from array and check if 7-2 =5 is there in list. If not add in set");
		solution2(arr, sum);
		System.out.println("sort the array. two pointers. add them and check if key is greater than sum, then low++  else high --");
		solution3(arr, sum);
	}

	

	private static void solution1(int[] arr, int sum) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] + arr[j] == sum) {
					System.out.println(arr[i]+ " " +arr[j]);
				}
			}
		}
		
	}
	private static void solution2(int[] arr, int sum) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Set set = new HashSet(arr.length);
		for(int i=0;i<arr.length;i++) {
			
			if(!set.contains(sum - arr[i])) {
				set.add(arr[i]);
			}
			else {
				System.out.println(arr[i] + " "+ (sum - arr[i]));
			}
		}
	}

private static void solution3(int[] arr, int k) {
	// TODO Auto-generated method stub
	Arrays.sort(arr); 
	int left = 0;
	int right = arr.length -1;
	while(left < right){
		int sum = arr[left] + arr[right];
	if(sum == k){
		System.out.printf("(%d, %d) %n", 
		arr[left], arr[right]);
		left = left + 1;
		right = right -1; 
	}
	else if(sum < k){ left = left +1; }
	else if (sum > k) { right = right -1; } }
	}
}

