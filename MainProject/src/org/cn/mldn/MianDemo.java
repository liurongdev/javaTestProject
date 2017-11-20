package org.cn.mldn;

import java.util.ArrayList;
import java.util.Collection;

class Person{
	private int age;
	private String name;
	public void show(){
		System.out.println("this is person's show()");
	}
}
class Student extends Person{
	private String school;
	public void show(){
		System.out.println("this is Student's show()");
	}
	public void disPlay(){
		System.out.println("this is Student's disPaly()");
	}
}
public class MianDemo {
	public static void main(String [] args){
		Person person=new Student()	;
		person.show();
		//person.disPlay();
		
		Collection<Integer> c=new ArrayList<Integer>();
		for(int i=0;i<3;i++){
			c.add(i);
		}
		for(Integer i:c){
			System.out.println(i);
		}
	}
}
