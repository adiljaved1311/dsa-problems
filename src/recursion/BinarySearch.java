package recursion;

public class BinarySearch {

	public static void main(String[] args) {
		
	}
	public static int RBinarySearch(int a[],int lower, int upper,int num){
		if(lower == upper)
		{
			if(a[lower] == num)
				return lower;
			else
				return -1;
		}
		else 
		{
			int mid = (lower+upper)/2;
			if(num == a[mid])
				return mid;
			else
			{
				if(num > a[mid])
					return RBinarySearch(a,mid+1,upper,num);
				else
					return RBinarySearch(a,lower,mid-1,num);
			}
		}
	}	
}
