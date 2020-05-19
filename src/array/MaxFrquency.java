package array;
import java.util.*;
public class MaxFrquency 
{
	public static void main(String[] args) 
	{
		int a[] = {1,1,2,2,3,3,3,3};
		// 1,2,2,3,3,3
		System.out.println(maxFrequency1(a));
	}
	
	public static int maxfrequency2(int a[])    // Time -> O(n)  &  Space -> O(n)
    {
    HashMap<Integer, Integer> map = new HashMap<>();
    int counter = 0;
    int max_frequency = 0;
    int max_num = a[0];
    for(int i=0; i<a.length; i++)
    {
        if(map.containsKey(a[i]))
        {
            map.put(a[i],map.get(a[i])+1);
        }else
        {
            map.put(a[i],1);
        }
    }
    for(int i=0; i<a.length; i++)
    {
        if(map.containsKey(a[i])) {
            counter = map.get(a[i]);
            if (max_frequency < counter) {
                max_frequency = counter;
                max_num = a[i];
            }
        }
    }
    return max_num;
}

public static int maxfrequency3(int a[])  // For Sorted Array
{
    int max_frequency = 0;               // Time -> O(n)  &  Space -> O(1)
    int max_num = a[0];
    int counter = 1;
    for(int i=0;i<a.length-1; i++)
    {
        if(a[i] == a[i+1])
        {
            counter++;
        }else
        {
            if(max_frequency < counter)
            {
                max_frequency = counter;
                max_num = a[i];
            }
            counter = 1;
        }
    }
    if(max_frequency < counter)
    {
        max_frequency = counter;
        max_num = a[a.length-1];
    }
    return max_num;
}
	
	private static int maxFrequency1(int a[])  // O(n^2)
	{
		int num=a[0],counter=0,maxCounter=0;
		for(int i=0; i<a.length; i++)
		{
			counter = 1;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] == a[j])
					counter++;
			}
			if(counter > maxCounter)
			{
				maxCounter = counter;
				num = a[i];
			}
		}
		return num;
	}
}
