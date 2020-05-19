package array;

public class RotatedShiftArray {

	public static void main(String[] args) {
		int a[] = {9,12,15,17,19,2,4,5,7,8};
		int b[] = {2,4,5,7,8,9,12,15,17,19};
		int rotation = countRotation(a);
		int r = countRotation(b);
		System.out.println(rotation);
		System.out.println(r);
	}
	public static int shiftedBinarySearch(int a[], int num) {
		int firstElement = firstElement(a);
		if(firstElement == 0 || num < a[0]) {  // number should be right side of first Element
			return binarySearch(a,firstElement,a.length-1,num);
		}else {                                // number should be left side of first Element
			return binarySearch(a,0,firstElement-1,num);
		}
	}
	private static int firstElement(int a[]) {  // find the index of first element of array
		int lower = 0;
		int upper = a.length-1;
		while(lower <= upper) {
			int mid = (lower+upper)/2;
			if(mid == 0 || a[mid] < a[mid-1]) {
				return mid;
			}else if(a[mid] > a[0])
				lower = mid+1;
			else
				upper = mid-1;
		}
		return 0;
	}
	private static int binarySearch(int a[],int low, int high, int num) {
		while(low <= high) {
			int mid = (low+high)/2;
			if(a[mid] == num)
				return mid;
			else if(num > a[mid])
				low = mid+1;
			else
				high = mid-1;
		}
		return -1;
	}
	public static int countRotation(int a[]) {
		int firstElement = firstElement(a);
		if (firstElement == 0)
				return 0;
		return (a.length-firstElement);
	}
}
