package org.cn.vo;

public class MainJava {
	class Person{
		private int age;
		public int value(){
			return age;
		}
		public void show(){
			System.out.println("age=="+this.age);
		}
	}
	class Student{
		private String name;
		Student(String name){
			this.name=name;
		}
		String readName(){
			return name;
		}
		public void show(){
			System.out.println("student'name=="+name);
		}
	}
	public Person to(){
		return new Person();
	}
	public Student getStudent(String name){
		return new Student(name);
	}
	public void ship(String name){
		Person p=to();
		p.show();
		Student student=getStudent(name);
		student.show();
		
	}
	public static void main(String args[]){
		//System.out.println("hello java");
		MainJava java=new MainJava();
		java.ship("liurong"); 
		Person p=java.to();
		p.show();
	}
}
