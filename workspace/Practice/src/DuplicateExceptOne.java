/*
 * Here you need to find the unique number which is not repeated twice.
 * For example if given array is {1, 1, 2, 2, 3, 4, 4, 5, 5} then your program should return 3.
 * */
public class DuplicateExceptOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {1, 1, 2, 2, 3, 4, 4, 5, 5};
		int sum = 0;
		for(int i=0;i<input.length;i++) {
			sum = sum ^ input[i];
		}
		System.out.println(sum);
	}

}
