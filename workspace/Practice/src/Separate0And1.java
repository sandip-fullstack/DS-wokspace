/*
 * Segregate 0s and 1s in an array
 */
public class Separate0And1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		int left=0, right = arr.length - 1;
		while(left<right) {
			while(arr[left] == 0 && left<right) {
				left ++;
			}
			while(arr[right] == 1 && left<right) {
				right --;
			}
			if(left < right) {
				arr[left] = 0;
				arr[right] = 1;
				left++;
				right--;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

}
