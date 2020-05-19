package array;

public class NegativePositive {

	public static void main(String[] args) 
	{
		int a[] = {-41,-2,3,-4,-1,4,8,7,-21,-6};
		a = negativePositive(a);
		for(int x:a)
			System.out.print(x+", ");
	}
	public static int[] negativePositive(int a[])
	{
		int i = 0;
		for(int j=0; j<a.length; j++)
		{
			if(a[j] < 0)
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
			}
		}
		return a;
	}
}
