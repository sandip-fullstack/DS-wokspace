import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestUniqueSubstring {

	public static void main(String[] args) {
		System.out.println("Please enter the string..");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Set<Character> mySet = new HashSet<Character>();
		String longestTillNow = "";
		String longestOverAll = "";
		for(int i=0;i<input.length();i++) {
			if(mySet.contains(input.charAt(i))) {
				mySet.clear();
				longestTillNow = "";
			}
			longestTillNow+=input.charAt(i);
			mySet.add(input.charAt(i));
			if( longestTillNow.length() > longestOverAll.length()) {
				longestOverAll = longestTillNow;
			}
			
		}
		System.out.println(longestOverAll);
	}
}
