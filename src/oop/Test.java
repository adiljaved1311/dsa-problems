package oop;

abstract interface i{
    int x = 10;
	public abstract void m();
}
interface i2 {}
interface i3 extends i,i2{} 
class D{}
class E extends D{}

abstract class A{
	public D m1() {
		return new D();
	}
}
class B extends A{
	
	public E m1() {
		return new E();
	}
	private final static void n() {
		
	}
}
abstract class V{
	public V() {
		
	}
	public abstract void m();
}

public class Test {
	public static void main(String []args) {
		
	}
}
