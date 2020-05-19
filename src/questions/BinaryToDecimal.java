package questions;
import static java.lang.Math.*;
public class BinaryToDecimal {

	public static void main(String[] args) 
	{
		int n = 10110;
		binToDec(n);
	}
	public static void binToDec(int num)
	{
		int sum=0,i=0;
		while(num != 0)
		{
			int n1 = num%10;
			sum += (n1 * pow(2,i));
			i++;
			num = num/10;
		}
		System.out.println(sum);
	}
	public static int power(int a, int b)
	{
		int result = 1;
		for(int i=1; i<=b; i++)
		{
			result *= a;
		}
		return result;
	}
}
