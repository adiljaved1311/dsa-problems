package array;

public class BinarySort {

	public static void main(String[] args) 
	{
		int a[] = {2,1,2,1,0,0,2};
		a = binarySort2(a);
		for(int x:a)
			System.out.print(x+" ");
	}
	
	public static void binarySort1(int a[])
    {
        int i = 0;
        for(int j=0;j<a.length;j++) {
            if (a[j] == 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
            }
        }
        for(int j=0;j<a.length;j++)
        {
            if(a[j] == 1)
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
            }
        }
    }
	
	public static int[] binarySort2(int a[])   //  T->O(n)  S->O(1)
	{
		int b[] = new int[3];
		for(int i=0; i<a.length; i++)
		{
			if(a[i] == 0)
				b[0]++;
			else if(a[i] == 1)
				b[1]++;
			else
				b[2]++;
		}
		int j=0;
		int i=0;
		for(i=0;i<b[0]; i++)  // i= 0,1   // j=0,1
		{
			a[j] = 0;
			j++;
		}
		for(i=0; i<b[1]; i++)  // i=0,1   // j=2,3
		{
			a[j] = 1;
			j++;
		}
		for(i=0; i<b[2]; i++)  // i=0,1,2   // j=4,5,6
		{
			a[j] = 2;
			j++;
		}
		return a;
	}
}
