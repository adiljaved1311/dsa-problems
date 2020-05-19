package array;

public class Reverse 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6,7,8,9};
		reverse(a);
	}
	public static void reverse(int a[])
	{
		int l=0,r=a.length-1;
		while(l<r)
		{
			int temp = a[l];
			a[l] = a[r];
			a[r] = temp;
			l++;
			r--;
		}
		for(int x:a)
			System.out.print(x+" ");
	}
}
