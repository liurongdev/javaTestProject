package org.cn.demo;


class Person{
	private String name;
	private int age;
	public void f(){
		System.out.println("Person's Public Method f()  ");
	}
	private void g(){
		System.out.println("this is private Method of g()");
	}
	protected void m(){
		System.out.println("this is protected  Method m()  ");
	}
}

class Student extends Person{
	private String school;
	public void show(){
		m();
		f();
	}
}
class Man{
	private String name;
	protected int age;
	public String favorate;
	private Man(String name,int age,String favorate){
		this.name=name;
		this.age=age;
		this.favorate=favorate;
	}
	private static Man man=new Man("liurong",23,"basketball");
	public static Man getMan(){
		return man;
	}
	void f9(){
		System.out.println("this is f9()  ");
		MainDemo demo=new MainDemo();
		demo.f2();
		demo.f3();
		demo.f4();
	}
}
public class MainDemo {
	public Person person=new Person();
	public static void main(String[] args){
		Person person=new Person();
		person.f();
		person.m();
		System.out.println("@@@@@@@@@");
		Student student=new Student();
		student.show();
	}
	public void f2(){
		System.out.println("this is MainDemo.f2()   ");
	}
	protected void f3(){
		System.out.println("this is MainDemo's Protected Method()");
	}
	void f4(){
		System.out.println("this is MainDemo's Package Method()  ");
	}
}
