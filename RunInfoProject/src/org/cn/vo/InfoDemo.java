package org.cn.vo;
class Person{
	private String name;
	private int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return "name="+name+";age="+age;
	}
}
public class InfoDemo {
	private static Person person=new Person("liurong",23);
	static void f(){
		person=new Person("xixi",24);
		for(int i=0;i<3;i++){
			if(i>2){
				return;
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args){
		InfoDemo demo1=new InfoDemo();
		InfoDemo demo2=new InfoDemo();
		System.out.println(demo1.person==demo2.person);
		System.out.println(demo1.person.equals(demo2.person));
		
	}
}
