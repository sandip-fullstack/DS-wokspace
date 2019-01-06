/*
 * Java program to find the largest & smallest number in n numbers without using arrays
*/
public class MaxAndMinArray {
public static void main(String[] args) {
	int smallest = Integer.MAX_VALUE;
	int largest = Integer.MIN_VALUE;
	int[] input = {2, 24, 61, 8, 101, -12, 124, 16};
	for(int i=0;i<input.length;i++)
	{
	  int num=input[i];
	   if(num>largest)
	   {
		   largest=num;
	   }
	   if(num<smallest){
	       smallest=num;
	   }
	}
	System.out.println("smallest "+ smallest + "    largest  "+ largest);
}
}
