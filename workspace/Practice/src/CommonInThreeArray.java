import java.awt.List;
import java.util.ArrayList;

/*
 * How to find common elements in three sorted array?
 */
public class CommonInThreeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1[] = {1, 5, 10, 20, 40, 80};
		int input2[] = {6, 7, 20, 80, 100};
		int input3[] = {3, 4, 15, 20, 30, 70, 80, 120};
		ArrayList<Integer> newList = findCommon(input1, input2);
		int temp[] = new int[newList.size()];
		System.out.println(newList.size());
		for(int i=0;i<newList.size();i++) {
			temp[i] = newList.get(i);
		}
		ArrayList<Integer> finalList = findCommon(input3, temp);
		System.out.println(finalList);
	}

	private static  ArrayList<Integer> findCommon(int[] input1, int[] input2) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i= 0;
		int j = 0;
		int count = 0;
		while(i<input1.length && j<input2.length) {
			
			if(input1[i] < input2[j]) {
				// temp[count] = input1[i];
				i++;
			}
			else if(input1[i] > input2[j]) {
				// temp[count] = input2[j];
				j++;
			}
			else {
				list.add(input1[i]);
				i++;
				j++;
			}
			count ++;
		}
		return list;
	}

}
