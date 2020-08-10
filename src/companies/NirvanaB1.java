package companies;
import java.util.Scanner;

public class NirvanaB1 {

    private static Scanner sc;

	public static void main(String[] args) {
        findMinimumSum();
    }

    public static void findMinimumSum() { 
        sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            System.out.println(findMinimumSum(N));
        }
    }

//    private static int findMinimumSum(int N) {
//
//        int num = (int) Math.floor(Math.sqrt(N))+1;
//        return num + num;
//    }
    
    private static int findMinimumSum(int N) {
    	int sum = 0;
    	int minSum = N;
    	for(int i=1; i<=N+1; i++) {
    		int j = (int)Math.ceil(N/i);
    		sum = i+j;
    		if(minSum > sum) {
    			minSum = sum;
    		}
    	}
    	return minSum;
    }
}