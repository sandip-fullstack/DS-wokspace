package CheckCons;

import java.awt.List;
import java.util.Arrays;
import java.util.Scanner;

public class CheckCons {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] voewlArray = {"a","e","i","o","u","y"};;
		String word = sc.next();
		List valid = (List) Arrays.asList(voewlArray);
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i) == word.charAt(i+1) || valid.contains(word.charAt(i)+'') &&valid.contains(word.charAt(i+1)+'')) {
		}
	}
}
