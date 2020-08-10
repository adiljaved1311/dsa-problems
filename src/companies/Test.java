package companies;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		System.out.println(lastCharRepeat3Times("abccbcbccb"));
		
	}
	public static char lastCharRepeat3Times(String s) {
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0; i<s.length();i++) {
			char c = s.charAt(i);
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}else {
				map.put(c,1);
			}
		}
		for(int i=s.length()-1;i>=0;i--) {
			char c = s.charAt(i);
			if(map.get(c) >= 3)
				return c;
		}
		return '-';
	}

}
