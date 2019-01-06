/*How to find the missing number in integer array of 1 to 100? */

public class MissingInteger {
	public static void main(String[] args) {
		int arr[] = new int[100];
		for(int i=0;i<=99;i++) {
			if(i != 21) // making 22 missing
			arr[i] = i+1;
		}
		int sumShouldBe = (arr.length*(arr.length + 1))/2;
		int sumNow = 0;
		for(int i=0;i<arr.length;i++)
			sumNow+= arr[i];
		System.out.println(sumShouldBe - sumNow);
		
		// Solution 2
		
//		int X=0,Y=0;
//		for(int i=0;i<arr.length;i++) {
//			X^=arr[i];
//		}
//		for(int i=1;i<=arr.length;i++) {
//			Y^=i;
//		}
//		System.out.println(X^Y);
}
}
