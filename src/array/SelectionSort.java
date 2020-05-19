package array;

public class SelectionSort {

	public static void main(String[] args) 
	{
		int a[] = {1,0,5,4,7};
		a = selectionSort(a);
		for(int x:a)
			System.out.print(x+" ");
	}
	public static int[] selectionSort(int a[])
	{
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
}
