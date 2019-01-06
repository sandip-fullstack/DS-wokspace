
public class AppearThriceAndRemainingTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 1, 3, 1, 3, 2, 3};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum^=arr[i];
		}
		System.out.println(sum);
	}

}
