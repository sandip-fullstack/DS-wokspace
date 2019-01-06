
public class TrappingWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{3, 0, 0, 2, 0, 4};
		int left[] = new int[arr.length];
		int right[] = new int[arr.length];
		left[0] = arr[0];
		right[arr.length - 1] = arr[arr.length - 1];
		for(int i=1;i<arr.length;i++) {
			left[i] = Math.max(left[i-1], arr[i]);
		}
		for(int j=arr.length-2;j>=0;j--) {
			right[j] = Math.max(right[j+1], arr[j]);
		}
		int water = 0;
		for(int i=0;i<arr.length;i++) {
			water+= Math.min(left[i], right[i]) - arr[i];
		}
		System.out.println(water);
	}
}
