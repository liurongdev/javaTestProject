package org.lr.vo;

public class MainDemo2 {	
	public static void main(String args[]){
		System.out.println("hello world!!!");
		Person person=new Person("liurong",23);
		System.out.println(person);
	}
}
class Person{
	private String name;
	private int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String toString(){
		return this.name+" "+this.age;
	}
}
