package org.cn.vo;

public class MainTest {
	class Person{
		private int age;
		public int value(){
			return age;
		}
	}
	class Student{
		private String name;
		Student(String name2){
			this.name=name2;
		}
		String readName(){
			return name;
		}
	}
	public void ship(String name){
		Student student=new Student(name);
		Person person=new Person();
		System.out.println(student.readName());
	}
	public static void main(String args[]){
		MainTest test=new MainTest();
		test.ship("liurong");
	}
}
