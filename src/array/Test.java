package array;

public class Test {

	public static void main(String[] args) 
	{
		System.out.println(sum(4325));
	}
	public static int sum(int num)
	{
		int sum1 = 0;
		if(num>0)
		{
			sum1  = num%10;
			return sum(num/10)+sum1;
		}
		return sum1;
	}
}
