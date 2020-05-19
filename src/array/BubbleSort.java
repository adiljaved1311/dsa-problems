package array;

public class BubbleSort {

	public static void main(String[] args) 
	{
		int a[] = {1,5,6,7,8,2,4};
		a = bubbleSort(a);
		for(int x:a)
			System.out.print(x+" ");
	}
	public static int[] bubbleSort(int a[])
	{
		int temp = 0;
		for(int i=1; i<a.length; i++)
		{
			for(int j=0; j<a.length-i; j++)
			{
				if(a[j]>a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
	}
}
