package org.cn.vo;
class Student{
	private String s="Student";
	public void append(String a){
		s+=a;
	}
	public void show(){
		append("show");
	}
	public void display(){
		append("display");
	}
	public void like(){
		append("like");
	}
	public String toString(){
		return s;
	}
	public static void main(String[] args){
		Student student=new Student();
		student.show();
		student.like();
		student.display();
		System.out.println(student);
	}
	protected void age(){
		System.out.println("this is Student's Method");
	}
	
}
public class ClassDemo extends Student{
	public void show(){
		append("ClassDemo's show");
		super.show();
	}
	public void name(){
		append("name");
	}
	public static void main(String[] args){
		ClassDemo demo=new ClassDemo();
		demo.show();
		demo.display();
		demo.name();
		demo.like();
		demo.age();
		System.out.println(demo);
		Student.main(args);
	}
}
