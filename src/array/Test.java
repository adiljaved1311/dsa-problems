package array;

public class Test {

	public static void main(String[] args) 
	{
		int a[] = {1,2,5,7,8,9,10};
		int x[] = a.clone();
		x[0] = 0;
		System.out.println(a[0]);
		for(int y:x)
			System.out.print(y+" ");
	}
}
