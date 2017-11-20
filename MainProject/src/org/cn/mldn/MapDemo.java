package org.cn.mldn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Person3{
	private String name;
	private int age;
	public Person3(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return "name="+name+",age="+age;
	}
}
public class MapDemo {
	public static void  main(String[] args){
		System.out.println("@@@@@@@@@@@@@");
		Map<String,List<Person3>> map=new HashMap<String ,List<Person3>>();
		map.put("liurong", Arrays.asList(new Person3("rong",24),new Person3("liu",23)));
		map.put("xixi", Arrays.asList(new Person3("xixi",24),new Person3("chen",25)));
		for(String key:map.keySet()){
			System.out.println(key);
			for(Person3 person: map.get(key)){
				System.out.println(person);
			}
		}
	}
}
