package array;

public class InsertionSort {

	public static void main(String[] args) {
		int a[] = {10,50,20,27,89,12,23,5,2};
		
		int temp=0;
		
		for(int i=1;i<a.length;i++) 
		{
			for(int j=0;j<=i-1;j++) 
			{
				if(a[j]>a[i]) 
				{
					temp = a[i];
					for(int k=i;k>j;k--) 
					{
						a[k] = a[k-1];
					}
					a[j] = temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
}	