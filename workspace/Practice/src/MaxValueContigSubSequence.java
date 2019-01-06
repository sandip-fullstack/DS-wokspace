
public class MaxValueContigSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2,11,-4,13,-5,2};
		MaxContSum(arr);
	}

	private static void MaxContSum(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int maxSum = 0;
		for(int i=0;i<n;i++) {
			int currentSum = 0;
			for( int j=i;j<n;j++) {
				currentSum+=arr[j];
				if(currentSum > maxSum) {
					maxSum = currentSum;
				}
			}
		}

		System.out.println(maxSum);
	}

}
