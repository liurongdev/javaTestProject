package org.cn.vo;

class Fruit{}
class Apple extends Fruit{}
class MyApple extends Apple{}
class Orange extends Fruit{}
public class MyDemo {
	public static void main(String[] args){
		Fruit[] fruit=new Apple[4];
		fruit[0]=new Apple();
		fruit[1]=new MyApple();
		try{
			System.out.println("!!!!!!!!!!");
			fruit[1]=new Orange();
		}catch(Exception e){
			System.out.println(e);
		}
		try{
			System.out.println();
			fruit[0]=new Fruit();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
