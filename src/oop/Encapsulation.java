package oop;

class Student{
	private int age;
	public void setAge(int age)throws Exception{
		if(age<0) {
			throw new Exception("Invalid Age");
		}else {
			this.age=age;
		}
	}
	public int getAge() {
		return this.age;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Student s1 = new Student();
		try {
			s1.setAge(15);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(s1.getAge());
		
	}

}
