import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Given array is already sorted, and it has duplicate elements.
 *  Write a program to remove duplicate elements and return new array without any duplicate elements.
 *   The array should contain only unique elements. */
public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] input = {2,3,6,6,8,9,10,10,10,12,12};
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<input.length;i++) {
			set.add(input[i]);
		}
		Iterator it = set.iterator();
		while(it.hasNext()) {
		  System.out.println(it.next());
		}
		
	}

	
}
