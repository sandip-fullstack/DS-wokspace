
public class TopNElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int large[] = new int[5];
		int array[] = { 33, 55, 13, 46, 87, 42, 10, 34, 43, 56 };
		int max = 0, index;
		for(int i=0;i<5;i++) { 
			max = array[0];
			index = 0;
			for(int j=1;j<array.length;j++) {
				if(max <array[j]) {
					max = array[j];
					index = j;
				}
			}
			large[i] = max;
			array[index] = Integer.MIN_VALUE;
			System.out.println("Largest " + i +  " : " + large[i]);
		}
	}
}
