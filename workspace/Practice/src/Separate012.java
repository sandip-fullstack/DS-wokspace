
public class Separate012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {0,1,2,1,2,1,0,0,2,0};
		int low=0;
		int mid=0;
		int temp=0;
		int high= input.length - 1;
		while(mid<=high) {
			switch(input[mid]) {
			case 0:  temp   =  input[low];
					input[low]  = input[mid];
					input[mid] = temp;
					low++;mid++;
					break;
			case 1: mid++;
					break;
			case 2: temp   =  input[mid];
					input[mid]  = input[high];
					input[high] = temp;
					high--;
					break;
			}
		}
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i] + " ");
		}
	}
}
