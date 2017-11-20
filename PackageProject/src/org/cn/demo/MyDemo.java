package org.cn.demo;

public class MyDemo extends MainDemo {
	
	public static void main(String[] args){
		System.out.println("hello l am MyDemo");
	}
	public  void test(){
		f2();
		f3();
		f4();
	}
	public void show(){
		Person person=new Person();
		person.f();
		person.m();
	
		
	}
}
