package org.cn.mldn;

abstract class Apple{
		private int i;
		public void show(){
			System.out.println("this is Apple's show()");
		}
		public abstract void eat();
		public String getString(){
			return "Apple";
		}
}
class MyApple extends Apple{
	public void eat(){
		System.out.println("this is MyApple's eat()");
	}
}
public class AbstractDemoTest {
	public static void main(String[] args){
		Apple apple=new MyApple();
		apple.eat();
		//Apple apple2=new Apple();
	}
}
