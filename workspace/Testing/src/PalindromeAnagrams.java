import java.util.HashSet;
import java.util.Set;

public class PalindromeAnagrams {

	private static Set<String> anagrams = new HashSet<String>();
	
	public static void main(String[] args) 
	{
		String str = "ABCDE";
		permutation("", str);
		System.out.println("ANAGRMAS\n-------------------");
		for(String s : anagrams)
		{
			System.out.println(s);
		}
		System.out.println("\n\nPALINDROME\n-------------------");
		checkForPalindroms();
	}
	
	private static void permutation(String prefix, String str) 
	{
	    int n = str.length();
	    if (n == 0) 
	    {
	    	anagrams.add(prefix);
	    }
	    else 
	    {
	        for (int i = 0; i < n; i++)
	        {
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1));
	        }
	    }
	}
	
	private static void checkForPalindroms() 
	{
		for(String str : anagrams)
		{
			boolean isPalindrome = false;
			int middle = str.length()/2;
			if(middle % 2 == 0)
			{
				isPalindrome = isPalindrome(str.substring(0, middle), str.substring(middle, str.length()));
			}
			else
			{
				isPalindrome = isPalindrome(str.substring(0, middle), str.substring(middle+1, str.length()));
			}

			if(isPalindrome)
			{
				System.out.println(str);
			}
		}
	}
	
	private static boolean isPalindrome(String firstHalf, String secondHalf)
	{
		StringBuilder sb = new StringBuilder(secondHalf);
		
		return firstHalf.equalsIgnoreCase(sb.reverse().toString());
	}
}