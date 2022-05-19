package companies.serviceNow;

import java.util.Arrays;
import java.util.List;

//Given an array of integers and a positive integer ,
// determine the number of(i,j)  pairs where i<j and  arr[i]+arr[j]  is divisible by k.
public class DivisibleSumPair {
    public static void main(String[] args) {
        List arr = Arrays.asList(5, 9, 10, 7, 4);
        int k = 2;
        System.out.println(divisibleSumPairs(6,k,arr));
        //System.out.println(0/4);
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> arr) {
        int freq[] = new int[k];
        for (int i = 0; i < arr.size(); i++) {
            int index = arr.get(i) % k;
            ++freq[index];
            //++freq[arr.get(0) % k];
        }
        // If both pairs are divisible by 'K'
        int numOfPairs = freq[0] * (freq[0] - 1) / 2;  // 3*2/2

        // count for all i and (k-i)
        // freq pairs
        for (int i = 1; i <= k / 2 && i != (k - i); i++)
            numOfPairs += freq[i] * freq[k - i];
        // If k is even
        if (k % 2 == 0)
            numOfPairs += (freq[k / 2] * (freq[k / 2] - 1) / 2);

//        int left = 1;
//        int right = freq.length-1;
//        while(left < right){
//            numOfPairs += (freq[left]*freq[right]);   // 1,4,7,10  2,5
//            left++;
//            right--;
//        }
//        if (k % 2 == 0)
//           numOfPairs += (freq[k / 2] * (freq[k / 2] - 1) / 2);
        return numOfPairs;
    }


    public static int divisibleSumPairs1(int n, int k, List<Integer> arr) { // T- >O(n^2)
        int numOfPairs = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if ((arr.get(i) + arr.get(j)) % k == 0) {
                    numOfPairs++;
                }
            }
        }
        return numOfPairs;
    }
}
