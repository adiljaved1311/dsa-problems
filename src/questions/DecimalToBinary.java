package questions;
import java.util.*;
public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(25));
		List<Integer> l1 = decimalToBinary(25);
		for(int x:l1)
			System.out.print(x);

	}
	public static List<Integer> decimalToBinary(int n)
	{
		List<Integer> l = new ArrayList<>();
		while( n!= 0)
		{
			if(n%2 == 0)
			{
				l.add(0,0);
			}else
				l.add(0,1);
			n = n/2;
		}
		return l;
	}
}
