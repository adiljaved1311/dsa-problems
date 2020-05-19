package array;

public class LargeSmallElement {

	public static void main(String[] args) 
	{
		int a[] = {5,4,8,9,7,2,1};
		m(a);
	}
	public static void m(int a[])
	{
		int l = a[0],s=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(l<a[i])
				l = a[i];
			if(s>a[i])
				s=a[i];
		}
		System.out.println("Largest Num : "+l);
		System.out.println("Smalest Num : "+s);
	}
}
