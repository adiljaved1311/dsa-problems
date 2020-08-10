package oop;

class Calculator{
	
	public int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	public double add(double a, double b) {
		double sum = a+b;
		return sum;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(10,20));
		System.out.println(c.add(15.5,5.2));
	}
}
