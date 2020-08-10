package array;

public class FirstAndLastPos {
// find first and last position of an element in an sorted array
	public static void main(String[] args) {
		int a[] = { 4, 5, 7, 7, 8, 8, 10 };
		int num = 8;
		int b[] = searchPos2(a, num);
		for (int x : b)
			System.out.print(x + ", ");
	}

	public static int[] searchPos1(int a[], int num) // O(n)
	{
		int b[] = { -1, -1 };
		int i = 0;
		for (i = 0; i < a.length; i++) {
			if (a[i] == num) {
				b[0] = i;
				break;
			}
		}
		for (int j = a.length - 1; j >= i; j--) {
			if (a[j] == num) {
				b[1] = j;
				break;
			}
		}
		return b;
	}

	public static int[] searchPos2(int a[], int num) // O(log n)
	{
		int b[] = new int[2];
		b[0] = findStartingIndex(a, num);
		b[1] = findEndingIndex(a, num);
		return b;
	}

	private static int findStartingIndex(int a[], int num) {
		int index = -1;
		int start = 0;
		int end = a.length - 1;
		// 5 7 7 8 8 10
		while (start <= end) {
			int midPoint = (start + end) / 2;
			if (num <= a[midPoint]) {
				end = midPoint - 1;
			} else {
				start = midPoint + 1;
			}
			if (num == a[midPoint])
				index = midPoint;
		}
		return index;

	}

	private static int findEndingIndex(int a[], int num) {
		int index = -1;
		int start = 0;
		int end = a.length - 1;

		while (start <= end) {
			int midPoint = (start + end) / 2;
			if (num >= a[midPoint]) {
				start = midPoint + 1;
			} else {
				end = midPoint - 1;
			}
			if (num == a[midPoint])
				index = midPoint;
		}
		return index;
	}

}
