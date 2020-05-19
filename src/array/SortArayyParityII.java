package array;

public class SortArayyParityII {
// Given an array A of non-negative integers, half of the integers in A are odd, 
// and half of the integers are even.
// Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
	
	public static void main(String[] args) 
	{
		int a[] = {4,2,5,7};
		int b[] = sortArrayByParity2(a);
		for(int x:b)
			System.out.print(x+" ");
	}
	public static int[] sortArrayByParity1(int[] a)
	{
        int[] new_arr = new int[a.length];       // Time -> O(n)
        for(int i=0,j=0; i<a.length; i++)        // Space -> O(n) 
        {
            if(a[i] %2 == 0)
            {
                new_arr[j] = a[i];
                j += 2;
            }
        }
        for(int i=0,j=1; i<a.length; i++)
        {
            if(a[i] %2 != 0)
            {
                new_arr[j] = a[i];
                j += 2;
            }
        }
        return new_arr;
	}
	
	public static int[] sortArrayByParity2(int[] A)  // Time  ->  O(n)
	{                                                // space -> O(1)
		int i = 0;
        int j = 1;
        int n = A.length;
        
        while(i<n && j<n)
        {
            while(i<n && A[i]%2 == 0)
            {
                i = i+2;
            }
            while(j<n && A[j]%2 != 0)
            {
                j = j+2;
            }
            if(i<n && j<n)
            {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
            
        }
        return A;
	}
}
