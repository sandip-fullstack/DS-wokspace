/*
 * Given two sorted arrays, find their union and intersection.

For example, if the input arrays are: 
arr1[] = {1, 3, 4, 5, 7}
arr2[] = {2, 3, 5, 6}
Then your program should print Union as {1, 2, 3, 4, 5, 6, 7} and Intersection as {3, 5}. 
 * */
/*
 * Algorithm Union(arr1[], arr2[]):
For union of two arrays, follow the following merge procedure.
1) Use two index variables i and j, initial values i = 0, j = 0
2) If arr1[i] is smaller than arr2[j] then print arr1[i] and increment i.
3) If arr1[i] is greater than arr2[j] then print arr2[j] and increment j.
4) If both are same then print any of them and increment both i and j.
5) Print remaining elements of the larger array.
 */


/*
 * Algorithm Intersection(arr1[], arr2[]):
For Intersection of two arrays, print the element xonly if the element is present in both arrays.
1) Use two index variables i and j, initial values i = 0, j = 0
2) If arr1[i] is smaller than arr2[j] then increment i.
3) If arr1[i] is greater than arr2[j] then increment j.
4) If both are same then print any of them and increment both i and j.
 */
public class ArrayIntersection {
	public static void main(String[] args) {
		int input1[] = {1, 3, 4, 5, 7};
		int input2[] = {2, 3, 5, 6};
		int m = input1.length;
		int n = input2.length;
		int i=0;
		int j=0;
		while(i<m && j<n) {
			if(input1[i] < input2[j]){
				System.out.print(input1[i] + " ");
				i++;
			}
			else if(input1[i] > input2[j]) {
				System.out.print(input2[j] + " ");
				j++;
			}
			else {
				System.out.print(input1[i] + " " );
				i++;
				j++;
			}
		}
		 while(i < m)
		       System.out.print(input1[i++]+" ");
		 while(j < n)
		       System.out.print(input2[j++]+" ");
		 System.out.println();
		 System.out.println("---------- Intersection --------");
		 i=0;j=0;
		 while(i<m && j<n) {
				if(input1[i] < input2[j]){
					i++;
				}
				else if(input1[i] > input2[j]) {
					j++;
				}
				else {
					System.out.print(input1[i]+ " ");
					i++;
					j++;
				}
			}
			
	}
}
