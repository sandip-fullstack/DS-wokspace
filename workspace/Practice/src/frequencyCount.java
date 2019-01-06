import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class frequencyCount {
public static void main(String[] args) {
	String s = "abcacbfggd";
	Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	for(int i=0;i<s.length();i++) {
		if(!map.containsKey(s.charAt(i))) {
			map.put(s.charAt(i), 1);
		}
		else {
			map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
		}
	}
	Set<Character> set = map.keySet();
	for(char c : set) {
		System.out.println(c+"=>"+ map.get(c));
	}
}
}
