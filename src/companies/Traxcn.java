package companies;

public class Traxcn {

	public static void main(String[] args) {
		//System.out.println(oddEvenCharacters("TRACXN", 0));
		//printFizzBuzz();
		int a[] = {100,180,260,310,40,535,695};
		//int b[] = {7,1,5,3,6,4};
		System.out.println(buyAndSell(a));
		System.out.println();
		System.out.println(buyAndSell2(a));
	}

	public static String oddEvenCharacters(String s, int flag) {
		String result = "";
		int i = flag == 0 ? 1 : 0;
		for (; i < s.length(); i += 2) {
			char c = s.charAt(i);
			result += c;
		}
		return result;
	}
	
	
	public static void printFizzBuzz()
	{
	     for(int i=1; i<=100; i++)
	     {
	           if(i%15 == 0)
	           {
	                System.out.print("FizzBuzz"+" ");
	           }
	           else if(i%3 == 0)
	           { 
	                System.out.print("Fizz"+" "); 
	           }
	           else if(i%5 == 0)
	           { 
	                System.out.print("Buzz"+" "); 
	           }
	           else
	            {
	                  System.out.print(i+" ");
	            }
	     } 
	}
	
	public static String buyAndSell(int a[])
	{
	     int buyDay = -1;
	     int sellDay = -1;
	     int maxProfit = 0;
	     for(int i=0; i<a.length-1; i++)
	     {  
	    	 for(int j=i+1; j<a.length; j++)
	         {
	    		 int currentProfit = a[j]-a[i];
	    		 if(currentProfit > maxProfit)
	    		 {
	    			 maxProfit = currentProfit;
	    			 buyDay = i+1;
	    			 sellDay = j+1;     
	    		 }
	         }
	      }
	       
	       if(maxProfit == 0)
	       {
	            return "No Profit";
	       }else
	       {
	             return "Buy on - Day "+buyDay+" - Sell on - Day "+sellDay+" - Profit = "+maxProfit;
	       }
	}
	
	public static String buyAndSell2(int a[])
	{
		int currentBuyDay = 0;    // 100,180,260,310,40,535,695  7,1,5,3,6,4
		int currentSellDay = 1;
		int buyDay = 0;
		int sellDay = 0;
		int maxProfit = 0;
		int currentProfit = 0;
		for(int i = 0; i<a.length-1; i++)
		{
			if(a[i] < a[i+1])
			{
				currentBuyDay = i;
				currentSellDay = i+1;
				//System.out.println(currentBuyDay);
				break;
			}
				
		}
		while(currentSellDay+1 < a.length)
		{
			while(currentSellDay+1 < a.length && a[currentSellDay+1] > a[currentSellDay])
			{
				currentSellDay++;
			}
			
			System.out.println("currentSellDay  "+currentSellDay);  //-> 3 (310)
			currentProfit = a[currentSellDay] - a[currentBuyDay];
			if(currentProfit > maxProfit)
			{
				buyDay = currentBuyDay+1;
				sellDay = currentSellDay+1;
				maxProfit = currentProfit;
			}
			if(currentSellDay+1 < a.length )
			{
				if(a[currentBuyDay] > a[currentSellDay+1])
				{
					currentBuyDay = currentSellDay+1;
					currentSellDay = currentSellDay+2;
				}else
					currentSellDay = currentSellDay+1;
			}	
		}
		if(maxProfit == 0)
	       {
	            return "No Profit";
	       }else
	       {
	             return "Buy on - Day "+(buyDay)+" - Sell on - Day "+(sellDay)+" - Profit = "+maxProfit;
	       }
	}
}
