package array;

public class MergeSort {

	public static void main(String[] args) 
	{
		int a[] = {5,8,7,4,2,3,1,6};
		int lower = 0, upper = a.length-1;
		mergeSort(a, lower, upper);
		
		for(int x:a)
			System.out.print(x+" ");
	}
	public static void mergeSort(int a[], int lower, int upper)
	{
		if(lower < upper)
		{
			int mid = (lower+upper)/2;
			
			mergeSort(a, lower, mid);
			mergeSort(a, mid+1, upper);
			merge(a, lower, upper);
		} 
	}
    private static void merge(int a[], int lower, int upper)
	{		
			// Start Merging
    	    int len = (upper-lower)+1;
			int b[] = new int[len];
			int left = lower;
			int mid = (lower+upper)/2;
			int right = mid+1;
			int i = 0;
			
			while(left <= mid && right <= upper)
			{
				if(a[left] <= a[right])
					b[i++] = a[left++];
				else
					b[i++] = a[right++];
			}
			
			for(; left <= mid; left++,i++)
			{
				b[i] = a[left];
			}
			
			for(; right <= upper; right++,i++)
			{
				b[i] = a[right];
			}
			
			for(int k = 0, j=lower; j <= upper; k++,j++) 
			{
				a[j] = b[k];
			}
	}
}
