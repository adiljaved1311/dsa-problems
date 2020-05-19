package array;

public class SearchInsertPos {

	/* Given a sorted array and a target value, return the index if the target is found. 
	   If not, return the index where it would be if it were inserted in order.
       You may assume no duplicates in the array.
    */
	public static void main(String[] args) 
	{
		int a[] = {1,2,7,10,19};
		System.out.println(searchInsert1(a,15));
		System.out.println(searchInsert2(a,8));
	}
	    public static int searchInsert1(int[] nums, int target)  // T-> O(n)
	    {
	        if(target <= nums[0])
	            return 0;
	        if(target > nums[nums.length-1])
	            return nums.length;

	        for(int i=1; i<nums.length; i++)
	        {
	            if(nums[i] == target)
	            {
	                return i;
	            }
	            if(nums[i-1] < target && target < nums[i] )
	            {
	                return i;
	            }
	        }
	        return nums.length-1;
	    }
	    
	    public static int searchInsert2(int[] nums, int target)   // T-> O(logn)
	    {
	        if(target <= nums[0])
	            return 0;
	        if(target > nums[nums.length-1])
	            return nums.length;

	        int low = 0;
	        int high = nums.length-1;
	        while(low <= high)
	        {
	            int mid = (low+high)/2;
	            if(target == nums[mid])
	            {
	                return mid;
	            }else if(target > nums[mid])
	            {
	                low = mid+1;
	            }else
	            {
	                high = mid-1;
	            }
	        }
	        return high+1;
	    }  
}
