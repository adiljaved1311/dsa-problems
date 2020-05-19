package array;

/* Given an array numbers and a value value, remove all instances of that value in-place and return the new length.
   Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1)
   extra memory.

   Given numbers = [3,2,2,3], value = 3,
   Your function should return length = 2, with the first two elements of numbers being 2.
   It doesn't matter what you leave beyond the returned length.
*/
public class RemoveElement {

	public static void main(String[] args) {
		int a[] = {3,2,2,3};
		System.out.println(removeElement(a,3));
	}
	public static int removeElement(int a[], int val)
	{
		int i = 0;
		for(int j=0; j<a.length; j++)
		{
			if(a[j] != val)
			{
				a[i] = a[j];
				i++;
			}
		}
		return i;
	}
}
