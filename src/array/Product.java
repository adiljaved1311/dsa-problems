package array;

//Product of array elements except self

public class Product {
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4};
		int b[] = {2,3,4,1};
		a = product1(a);
		for(int x:a)
			System.out.print(x+" ");
		System.out.println();
		b = product4(b);
		for(int x:b)
			System.out.print(x+" ");
	}
	public static int[] product1(int a[])  //O(n^2)
	{
		int b[] = new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			int temp = 1;
			for(int j=0; j<a.length; j++)
			{
				temp *= a[j];
			}
			b[i] = temp/a[i];
		}
		return b;
	}
	public static int[] product2(int a[])  // T-> O(n)  && S-> O(n)
	{
		int output[] = new int[a.length];
		int temp = 1;
		for(int i=0;i<a.length;i++)
		{
			temp = temp * a[i];
		}	
		for(int i=0; i<output.length; i++)
		{
			output[i] = temp/a[i];
		}
			
		return output;
	}
	// Without using division operator
	public static int[] product3(int a[])   // T-> O(n)  S->O(n)
	{
		int n = a.length;    //  1,2,4,3
		int [] leftProducts = new int[n];
		int [] rightProducts = new int[n];
		int [] output = new int[n];
		
		leftProducts[0] = 1;
		rightProducts[n-1] = 1;
		
		for(int i=1; i<n; i++)
		{
			leftProducts[i] = a[i-1] * leftProducts[i-1];
		}
		for(int i=n-2; i>=0; i--)
		{
			rightProducts[i] = a[i+1] * rightProducts[i+1];
		}
		for(int i=0; i<n; i++)
		{
			output[i] = leftProducts[i] * rightProducts[i];
		}
		return output;
	}
	public static int[] product4(int[] a)     //  T->O(n)  S->O(n)
	{
		int[] output = new int[a.length];     //  2,3,4,1
		int temp = a[0];
		output[0] = 1;
		for(int i=1; i<a.length; i++)   // left products
		{
			output[i] = temp;
			temp = temp*a[i];
		}
		temp = a[a.length-1];
		for(int i=a.length-2; i>=0; i--)  // right products
		{
			output[i] = temp*output[i];
			temp = temp*a[i];
		}
		return output;
	}
}
