package org.cn.vo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Animal{}
class Dog extends Animal{}
class Cat extends Dog{}
class Tiger extends Animal{}
public class ListDemo {
	public static void main(String[] args){
		List<? extends Animal> list=Arrays.asList(new Dog());
		Dog dog=(Dog) list.get(0);
		list.contains(new Dog());
		list.indexOf(new Dog());
		System.out.println(	list.contains(new Dog())+"; "+list.indexOf(new Dog()));
		List<? extends Animal>list0=new ArrayList<Dog>();
		List<? extends Animal>list2=new ArrayList<Cat>();
		      
		
	}
	public static void add(List<? super Dog> list){
		list.add(new Dog());
		list.add(new Cat());
	}
	public static void add2(List<? extends Dog> list){
		
	}
}
