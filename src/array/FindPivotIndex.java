package array;

/*
  Given an array of integers numbers, write a method that returns the "pivot" index of this array.

  We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the
  sum of the numbers to the right of the index.
  If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the 
  left-most pivot index
  
  Input: 
  numbers = [1, 7, 3, 6, 5, 6]
  Output: 3
  Explanation: 
  The sum of the numbers to the left of index 3 (numbers[3]=6) is equal to the sum of numbers to the right of index 3.
  Also, 3 is the first index where this occurs.
*/
public class FindPivotIndex {
	public static void main(String[] args) {
		int a[] = { 1, 7, 3, 6, 5, 6 };
		System.out.println(findPivotIndex(a));
	}

	public static int findPivotIndex(int a[]) {
		if (a.length == 0)
			return -1;
		int left_sum = 0;
		int sum = 0;
		for (int x : a) {
			sum += x;
		}
		for (int i = 0; i < a.length; i++) {
			if (sum - a[i] == 2 * left_sum) {
				return i;
			}
			left_sum += a[i];
		}
		return -1;
	}
}
