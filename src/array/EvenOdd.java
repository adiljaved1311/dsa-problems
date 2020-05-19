package array;

public class EvenOdd {

	// Change the position of elements as even comes first and odd comes last
	public static void main(String[] args) 
	{
		int a[] = {8,5,2,4,6,7,9};
		a = evenOdd(a);
		for(int x:a)
			System.out.print(x+", ");
	}
	public static int[] evenOdd(int []a)
	{
		int i = 0;
		for(int j=0; j<a.length; j++)
		{
			if(a[j] % 2 == 0)
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
