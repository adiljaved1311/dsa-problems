package array;
import java.util.*;
public class Test {

	public static void main(String[] args) 
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(10,5);
		map.put(10,8);
		System.out.println(map.get(10));
	}
}
