import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Divisor {
	static TreeMap<Integer, Boolean> map = new TreeMap<Integer,Boolean>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long product = 1;
		for(int i=0;i<N;i++)
		{
			int val = sc.nextInt();
		    for (int j = 2; j <= (val); j++) {
		        if (val % j == 0) {
		           
		            map.put(j, true);
		            
		        }
		    }
		  
		}  
		System.out.println(map);
		}
	}


