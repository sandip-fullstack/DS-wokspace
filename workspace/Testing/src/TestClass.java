/*Anish Chakraborty's profile photo	Anish Chakraborty
Friends

Show details


Ma5termind and Subway are bored of their normal life.They want to do something interesting so that they can enjoy their last sem of college life.As usual Ma5termind comes up with a simple and interesting game.

Ma5termind gives Subway a compressed string. A compressed String is composed of characters and numbers.Every character in a compressed string contains a number. Ex a3b1c2 it represents aaabcc. Other compressed string could be a22b2a1 , z5c2x36. Each number in the compressed string indicates the number of times the corresponding character occurs in the string. The final string is 1 indexed. Ma5termind wants Subway to sort the compressed string and tell him the kth character in the sorted compressed string.Since subway got speed Ma5termind asks him various such questions.

Help Subway in answering Ma5termind's question.

Input:

The first line contains the compressed string.This is followed by Q that indicates the number of questions Ma5termind shoots on Subway.Follows Q lines each line contain an integer K.

Output:

For every question output the Kth character if it exists else print -1 .

Constraints:

2 <= Length of Compressed String <= 10^4

1<= Length of Final String <= 10^18

1<= Q <= 10^5

1<= K <= 10^18

Every character in the string is lowercase English letter.

Note:

The number for a character may contain leading zeroes.
Sample Input
(Plaintext Link)

a2b3c2a1
4
2
5
1
8

Sample Output
(Plaintext Link)

a
b
a
c

Explanation

The final sorted string is aaabbbcc.
Time Limit: 1 sec(s) for each input file.
Memory Limit: 256 MB
Source Limit: 1024 KB
Marking Scheme: Marks are awarded if any testcase passes.
Allowed languages: C, CPP, JAVA, PYTHON

*/



import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int noOfQuestion  = sc.nextInt();
		int arr[] = new int[noOfQuestion];
		for(int i=0;i<noOfQuestion;i++){
			arr[i] = sc.nextInt();
		}
		Map<Character, Integer> freqMap = new TreeMap<Character,Integer>();
		for(int i=0;i<input.length();i=i+1){
			while(Character.isLetter(input.charAt(i+1))){
				i++;
			}
			char inputChar = input.charAt(i);
			if(!freqMap.containsKey(inputChar)){
				freqMap.put(inputChar, Integer.parseInt(input.charAt(i+1)+""));
			}
			else{
				freqMap.put(inputChar, freqMap.get(inputChar)+Integer.parseInt(input.charAt(i+1)+""));
			}
		}	
		String output = "";
		for (char c: freqMap.keySet()){
			for(int i=0;i<freqMap.get(c);i++){
				output+=c;
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]<=output.length() && arr[i]!=0 &&arr[i]>0)
			System.out.println(output.charAt(arr[i]-1));
			
		}
	}
}
