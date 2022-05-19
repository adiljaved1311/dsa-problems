package companies.serviceNow;
/*
The cost of a stock on each day is given in an array,
 find the max profit that you can make by buying and selling in those days.
 For example, if the given array is {100, 180, 260, 310, 40, 535, 695},
 the maximum profit can earn by buying on day 0, selling on day 3. Again,
 buy on day 4 and sell on day 6. If the given array of prices is sorted in decreasing order,
 then profit cannot be earned at all.
 */
public class MaxProfitStock {
    public static void main(String[] args) {
        int arr[] = {100, 180, 260, 310, 40, 535, 695}; //11
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int arr[]) {
        int maxProfit = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1]){
                maxProfit = maxProfit + (arr[i] - arr[i-1]);
            }
        }
        return maxProfit;
    }
}
