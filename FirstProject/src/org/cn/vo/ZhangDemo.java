package org.cn.vo;
class Person3{
	private int age;
	private String name;
}
class Student extends Person3{
	private String school;
}
public class ZhangDemo {
	public static void main(String[] args){
		Student student=new Student();
		Person3 person=student;
		
		Person3 person3=new Person3();
		Student stu=(Student)person3;
	}
}
