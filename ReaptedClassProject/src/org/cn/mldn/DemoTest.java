package org.cn.mldn;
class Student{
	public void show(){
		System.out.println("Student's show()");
	}
	public Student(){
		System.out.println("before student()");
		show();
		System.out.println("after student()");
	}
}
class Person extends Student{
	private int radius;
	public Person(int i){
		radius=i;
		System.out.println("radius="+radius);
	}
	public void show(){
		System.out.println("Person's show radius="+radius);
	}
}
public class DemoTest {
	public static void main(String[] args){
		new Person(1);
	}
}
