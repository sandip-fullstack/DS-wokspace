import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int n = sc.nextInt();
		    System.out.println(fact(n));
		  
		}  
		}

	private static int fact(int n) {
		// TODO Auto-generated method stub
		if(n == 1)
			return 1;
		else
			return n* fact(n-1);
	}
	}


