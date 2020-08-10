package array;

import java.util.HashMap;

public class KSumSubarray {

	public static void main(String[] args) {
		int input1[] = { 100, 200, 0, -50, 10, 40, 20 };
		int result[] = K_sum1(input1, 50);
		System.out.println("Start -> " + result[0] + " End -> " + result[1]);
	}

	// for finding any SubArray having sum k
	public static int[] K_sum1(int a[], int k) 
	// Time -> O(n) &  Space -> O(n)
	{ 
		HashMap<Integer, Integer> arr_sum = new HashMap<>();
		int sum = 0;
		int result[] = { -1, -1 };
		arr_sum.put(0, -1);
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			int s = sum - k;
			if (arr_sum.containsKey(s)) {
				result[0] = arr_sum.get(s) + 1;
				result[1] = i;
				return result;
			}
			arr_sum.put(sum, i);
		}
		return result;
	}

	// For finding longest sub-array having sum k.
	public static int[] K_sum2(int a[], int k) {
		HashMap<Integer, Integer> arr_sum = new HashMap<>();
		int sum = 0;
		int result[] = { -1, -1 };
		int start = 0, end = 0, current_len = 0, len_arr = 0;
		arr_sum.put(0, -1);
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			int s = sum - k;
			if (arr_sum.containsKey(s)) {
				len_arr = (result[1] - result[0]) + 1;
				start = arr_sum.get(s) + 1;
				end = i;
				current_len = (end - start) + 1;
				if (current_len > len_arr) {
					result[0] = start;
					result[1] = end;
				}
			}
			if (!arr_sum.containsKey(sum)) {
				arr_sum.put(sum, i);
			}
		}
		return result;
	}
}
