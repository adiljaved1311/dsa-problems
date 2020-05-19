package questions;

public class AreaCircle 
{
	public static void main(String[] args) 
	{
		double r = 10.5;
		System.out.println("Area of Circle is : "+areaOfCircle(r));
	}
	public static double areaOfCircle(double radius)
	{
		double area = 3.14*radius*radius;
		return area;
	}
}
