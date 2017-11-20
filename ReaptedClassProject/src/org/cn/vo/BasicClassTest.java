package org.cn.vo;

class Zhang{
	Zhang(){
		System.out.println("Zhang");
	}
}
class MyZhang extends Zhang{
	MyZhang(){
		System.out.println("MyZhang");
	}
}
public class BasicClassTest extends MyZhang{
	public BasicClassTest(){
		System.out.println("this is BasicClassTest");
		System.out.println("BasicClassTest");
	}
	public static void main(String[] args){
		BasicClassTest demo=new BasicClassTest();
		
	}
}
