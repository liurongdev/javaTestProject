package org.cn.vo;

class Apple{
	public Apple(){
		System.out.println("Apple's Constructor");
	}
}
class HuMan{
	static{
		System.out.println("!!!!!!!!!!!!!!");
		Apple apple=new Apple();
	}
	public HuMan(){
		System.out.println("HuMan's Constructor");
	}
}
class WoMan extends HuMan{
	private int i=0;
	private HuMan man=new HuMan();
	
	private static HuMan man2=new HuMan();
	static{
		System.out.println("-------------");
	}
	public WoMan(){
		super();
		System.out.println("33333333333333333");
		System.out.println("WoMan's Constructor");
	}
	
}
public class DemoTest {
	private Apple apple=new Apple();
	public DemoTest(){
		System.out.println("DemoTest");
	}
	public static void main(String[] args){
		//DemoTest demo=new DemoTest();
		System.out.println("==========");
		WoMan man=new WoMan();
	}
}
