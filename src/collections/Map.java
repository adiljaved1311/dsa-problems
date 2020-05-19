package collections;
import java.util.HashMap;
public class Map {

	public static void main(String[] args) 
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(10,1);
		map.put(10,5);
		System.out.println(map.get(10));
		System.out.println(map.containsKey(10));
		System.out.println(map.containsValue(1));
	}

}
