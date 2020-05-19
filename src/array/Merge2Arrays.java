package array;

public class Merge2Arrays {

	public static void main(String[] args) 
	{
		int a[] = {1,2,6,7,9};
		int b[] = {3,4,5,8};
		merge(a,b);
	}
	
	public static void merge(int []a, int []b)
	{
		int i = 0, j = 0, k = 0;
		int []result = new int[(a.length)+(b.length)];
		while(i<a.length && j<b.length)
		{
			if(a[i] <= b[j])
			{
				result[k] = a[i];
				k++;
				i++;
			}else
			{
				result[k] = b[j];
				k++;
				j++;
			}
		}
		if(i >= a.length)
		{
			while(j < b.length)
			{
				result[k] = b[j];
				k++;
				j++;
			}
		}else if(j >= b.length)
		{
			while(i < a.length)
			{
				result[k] = a[i];
				k++;
				i++;
			}
		}
		
		for(int x:result)
			System.out.print(x+" ");
	}
}
