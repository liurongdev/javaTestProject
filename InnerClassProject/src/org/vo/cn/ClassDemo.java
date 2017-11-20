package org.vo.cn;

public class ClassDemo {
	public void f(){
		System.out.println("this is ClassDemo's f()");
	}
	static  class Person{
		public static void main(String[] args){
			ClassDemo demo=new ClassDemo();
			demo.f();
		}
	}
}
