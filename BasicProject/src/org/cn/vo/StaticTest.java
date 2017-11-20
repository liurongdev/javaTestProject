package org.cn.vo;

class Cup{
	public Cup(){
		System.out.println("cup!!!");
	}
	public void f(){
		System.out.println("!!!!!!!!!!!");
	}
}
class Cups{
	static Cup cup1;
	static Cup cup2;
	static{
		System.out.println("hello this is liurong");
	}
	static{
		System.out.println("hello this is cups");
		cup1=new Cup();
		cup2=new Cup();
	}
	
}
public class StaticTest {
	public static void main(String[] args){
		Cups.cup1.f();
	}
}
