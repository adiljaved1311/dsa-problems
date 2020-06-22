package array;

public class ClosestElements {

	public static void main(String[] args) {
		int a[] = {12,16,22,30,35,39,42,45,48,50,53,55,56};
		int k = 4;
		int x = 12;
		int result[] = closestElements(a,x,k);
		for(int i:result)
			System.out.print(i+" ");
	}
	public static int[] closestElements(int a[], int x, int k)
	{
		int result[] = new int[k];
		int index = -1;
		int low = 0, high = a.length-1, mid = 0;
		while(low <= high)   // Find the position of the given element
		{
			mid = (low+high)/2;
			if(x == a[mid]) {
				index = mid;
				break;
			}else if(x > a[mid])
			{
				low = mid+1;
			}else
				high = mid-1;
		}

		int left = index-1;
		int right = index+1;
		int counter = 0;
		int i = 0;
		while((left >= 0 && right < a.length) && counter < k)
		{
			int leftDiff = a[index]-a[left];
			int rightDiff = a[right] - a[index];
			if(leftDiff <= rightDiff)
			{
				result[i++] = a[left];
				left--;
			}else
			{
				result[i++] = a[right];
				right++;
			}
			counter++;
		}
		while(i < k)
		{
			if(left >= 0)
			{
				result[i++] = a[left--];
			}else if(right < a.length)
			{
				result[i++] = a[right++];
			}
		}
		return result;
	}
}
