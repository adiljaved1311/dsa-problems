package questions;

public class leapYear 
{
	public static void main(String[] args) 
	{
		int year = 2020;
		System.out.println(LeapYear(year));
	}
	public static boolean LeapYear(int year)
	{
		if(year % 400 == 0)
            return true;
        else if(year % 100 == 0)
            return false;
        else if(year % 4 == 0)
            return true;
        else
            return false;
	}
}
