package array;
/*
Given a sorted array numbers, remove the duplicates in-place such that each element appear only once and return 
the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1)
extra memory.

Example 1: Given numbers = [1,1,2],
Your function should return length = 2, with the first two elements of numbers being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.
*/
public class RemoveDuplicates {

	public static void main(String[] args) 
	{
		int a[] = {1,1,2};
		System.out.println(removeDuplicates(a));
	}
	public static int removeDuplicates(int a[])
	{
		if(a.length == 0) return 0;
        int i = 0;
        for(int j=1; j<a.length; j++)
        {
            if(a[j] != a[i])
            {
                i++;
                a[i] = a[j];
            }
        }
        return i+1;
	}
}
