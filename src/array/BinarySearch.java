package array;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = { 0, 1, 2, 3, 4, 6, 8, 10, 11, 12, 15 };
		System.out.println(binarySearch(a, 9));
	}

	public static int binarySearch(int a[], int n) {
		int upper = a.length - 1;
		int lower = 0;
		while (lower <= upper) {
			int mid = (lower + upper) / 2;
			if (a[mid] == n)
				return mid;
			else if (n > a[mid])
				lower = mid + 1;
			else
				upper = mid - 1;
		}
		return -1;
	}
}
