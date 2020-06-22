package string;
import java.util.*;
public class Balloon {

	public static void main(String[] args) {
		String s = "msohoyobnkalcljobaxlnl";
		System.out.println(countBalloon(s));
	}
	public static int countBalloon(String s) {
		HashMap<Character,Integer> map = new HashMap<>();
		int counter = 0;
		String b = "balloon";
		for(int i=0;i<b.length();i++) {
			char c = b.charAt(i);
			map.put(c,0);
		}
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(map.containsKey(c))
			{
				map.put(c,map.get(c)+1);
			}
		}
		abc:while(true) {
			for(int i=0; i<b.length(); i++)
			{
				char c = b.charAt(i);
				if(map.containsKey(c))
				{
					if(map.get(c) == 0)
						break abc;
					map.put(c,map.get(c)-1);
					
				}
			}
			counter++;
		}
		return counter;
	}
}
