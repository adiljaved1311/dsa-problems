package oop;

class Parent{
	public void print() {
		System.out.println("I am Parent class Method");
	}
}
class Child extends Parent{
	@Override
	public void print() {
		System.out.println("I am Child Class Method");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		Parent obj = new Child();
		obj.print();
	}

}
