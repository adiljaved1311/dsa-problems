package array;
import java.util.*;
public class PlusOne {

	public static void main(String[] args) {
		int input[] = {1,5,8};
		int output[] = plusOne4(input);
		for(int x:output)
			System.out.print(x+" ");
	}
	
	public static int[] plusOne4(int[] digits) {
        boolean flag = false;
        int []output;
        for(int j=0; j<digits.length; j++) {
        	if(digits[j] != 9) {
        		flag = true;
        		break;
        	}
        }
        if(flag == true) {
        	output = new int[digits.length];  // Time-> O(n) Space-> O(n)
        }else
        	output = new int[digits.length+1];
        int c=1; // carry
        int i = digits.length-1; // starting from the last index
        while(i >= 0){
            int n = digits[i]+c;
            if(n > 9){
                output[i] = n%10;
                c = 1;
            }else{
                output[i] = n;
                c = 0;
            }
            i--;
        }
        if(c == 1)
            output[0] = 1;
        return output;
    }
	
	// Time-> O(n)  Space-> O(n)
	public static int[] plusOne3(int[] digits) {
        int c=1; // carry
        int i = digits.length-1; // starting from the last index
        int output1[] = new int[digits.length];
        int output2[] = new int[digits.length+1];
        while(i >= 0){
            int n = digits[i]+c;
            if(n > 9){
                output1[i] = output2[i] = n%10;
                c = 1;
            }else{
                output1[i] = output2[i] = n;
                c = 0;
            }
            i--;
        }
        if(c == 1){
            output2[0] = 1;
            return output2;
        }
        return output1;
    }
	public static Integer[] plusOne2(int[] digits) {
		List<Integer> list = new ArrayList<>();
        int c=1; // carry
        int i = digits.length-1; // starting from the last index 
        while(i >= 0){
            int n = digits[i]+c;
            if(n > 9){
                list.add(0,n%10);
                c = 1;
            }else{
                list.add(0,n);
                c = 0;
            }
            i--;
        }
        if(c == 1)
        	list.add(0,1);
        
        Integer output[] = new Integer[0];
        output = list.toArray(output);
        return output;
    }
	
	public static int[] plusOne(int[] digits) {
        int c=1; // carry
        int i = digits.length-1; // starting from the last index 
        while(i >= 0)
        {
            int n = digits[i]+c;
            if(n > 9){
                digits[i] = n%10;
                c = 1;
            }else{
                digits[i] = n;
                c = 0;
            }
            i--;
        }
        if(c == 1){
            int result[] = new int[digits.length+1];
            result[0] = 1;
            for(int k=1,h=0 ; k<result.length; k++,h++){
                result[k] = digits[h];
            }
            return result;
        }
        return digits;
    }
}
