package array;
/*
  Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
  Note:
  The number of elements initialized in nums1 and nums2 are m and n respectively.
  You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements
  from nums2.

  Example:
  Input: nums1 = [1,2,3,0,0,0], m = 3  nums2 = [2,5,6],       n = 3
  Output: [1,2,2,3,5,6]
*/
public class MergeSortedArray {

	public static void main(String[] args) {
		int nums1[] = {1,2,3,0,0,0};
		int nums2[] = {2,5,6};
		nums1 = mergeSortedArray(nums1,3,nums2,3);
		for(int x:nums1)
		{
			System.out.print(x+" ");
		}
	}
	public static int[] mergeSortedArray(int nums1[], int m, int nums2 [], int n)
	{
		m--;
		n--;
		int index = nums1.length-1;
		while(index >= 0)
		{
			if(m < 0) {                     // Here our approach is starting from last and put all greater elements
				nums1[index] = nums2[n--];  //  one by one and goes to left till length becomes 0
			}else if(n < 0) {
				nums1[index] = nums1[m--];
			}else {
				if(nums1[m] > nums2[n]) {
					nums1[index] = nums1[m--];
				}else {
					nums1[index] = nums2[n--];
				}
			}
			index--;
		}
		return nums1;
	}

}
