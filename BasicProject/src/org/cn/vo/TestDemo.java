package org.cn.vo;

public class TestDemo {
	private static String NAME="xixi";
	private static int deptno;
	private int age=100;
	public static void f(String s,int a){
		System.out.println(s+" ;"+a);
	}
	public static void f(int a,String s){
		System.out.println(a+"; "+s);
	}
	public static void main(String[] args){
		System.out.println("deptno="+deptno);
		deptno++;
		f("liurong",23);
		f(21,"zhangsan");
		TestDemo demo=new TestDemo();
		demo.show();
	}
	public void show(){
		f("liurong",100);
		String myName=NAME;
		int myAge=age;
		int i;
		age++;
		System.out.println(age);
	}
	public static void test(){
		//show();  不能在静态方法中调用非静态方法
		f("xixi",100);
		String name1=NAME;
	}
	
	public void f(){
		int i=0;  
		
	}
}
