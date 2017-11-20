package org.cn.vo;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

class Person{
	private String name;
	public Person(String s){
		name=s;
	}
	public Person(){
		name="xixi";
	}
	public String toString(){
		return super.toString()+" ;"+name;
	}
	public void f(){
		System.out.println("hello");
	}
}
public class ListDemo {
	public static void main(String[] args){
		List<Person>list=new ArrayList<Person>(Collections.nCopies(4, new Person("liurong")));
		System.out.println(list);
		Collections.fill(list, new Person("xixi"));
		System.out.println(list);
		Person person=getPerson("wanghuai");
		person.f();
		
	}
	public static Person getPerson(final String name){
		return new Person(){
			public void f(){
				System.out.println("hello xixi");
			}
		};
	}
	
	private static class TestMap extends AbstractMap<String,String>{

		@Override
		public Set<java.util.Map.Entry<String, String>> entrySet() {
			// TODO Auto-generated method stub
			return null;
		}



		
	}

}	


