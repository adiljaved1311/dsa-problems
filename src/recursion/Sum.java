package recursion;

public class Sum {

	public static void main(String[] args) 
	{
		int num = 421;
		System.out.println(digitSum(num));
	}
	public static int digitSum(int num)
	{
		int sum = 0;
		if(num == 0)
			return sum;
		
		sum = num%10;
		return sum+digitSum(num/10);
	}
}
