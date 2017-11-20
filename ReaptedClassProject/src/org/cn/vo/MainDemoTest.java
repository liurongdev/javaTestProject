package org.cn.vo;

class Worker{
	private String name;
	Worker(String name2){
		name=name2;
	}
}
class CarWorker extends Worker{
	private int age;
	CarWorker(String name,int age2){
		super(name);
		this.age=age2;
	}
}
public class MainDemoTest extends CarWorker {
	public MainDemoTest(String name,int age){
		super(name,age);
		System.out.println("this is MainDemoTest");
	}
	public static void main(String[] args){
		MainDemoTest demo=new MainDemoTest("liurong",23);
		
	}
}
