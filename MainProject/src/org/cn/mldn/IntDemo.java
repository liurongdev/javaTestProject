package org.cn.mldn;

import java.util.Random;

class Man{
	int age;
}
public class IntDemo {
	public static void main(String[] args){
		Man person1=new Man();
		Man person2=new Man();
		person1.age=23;
		person2.age=24;
		System.out.println(person1.age);
		System.out.println(person2.age);
		int a=12;
		int b=1;
		a=b;
		a=100;
		System.out.format("a=%d;b=%d", a,b);
		person1=person2;
		person1.age=1000;
		System.out.println("peron1.age="+person1.age+"; person2.age="+person2.age);
		
		Random rand=new Random();
		for(int i=0;i<10;i++){
			System.out.print(rand.nextInt(20)+" ;");
		}
	}
}
