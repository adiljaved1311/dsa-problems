package oop;

class Demo{
	static int countObject = 0;
	Demo(){
		countObject++;
	}
}


public class CountObject {

	public static void main(String[] args) {
//		var d1 = new Demo();
//		var d2 = new Demo();
//		System.out.println(Demo.countObject);
//		var d3 = new Demo();
		System.out.println(Demo.countObject);
	}
}
