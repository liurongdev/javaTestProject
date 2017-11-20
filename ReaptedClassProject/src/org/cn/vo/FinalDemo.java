package org.cn.vo;
class Book{
	private int i;
	public Book(int i){
		this.i=i;
	}
}

class Test{
	private int age;
	public Test(int age){
		this.age=age;
	}
	private void f(){
		System.out.println("test's function f()");
	}
	private final void g(){
		System.out.println("test's final function g()");
	}
	public final void m(){
		System.out.println("test's public function m()");
	}
	public void h(){}
}
class MyTest extends Test{
	public MyTest(int age) {
		super(age);
	}
	public void h(){
		System.out.println("this is h");
	}
	private final void f(){
		System.out.println("this is MyTest's Method f()");
	}
	private void display(){
		System.out.println("this is MyTest's display()");
	}
	public void show(){
		f();
	}
}
class MyTestDemo extends MyTest{
	public MyTestDemo(int age){
		super(age);
	}
	public void f(){
		System.out.println("this is MyTestDemo f()");
	}
	
	public void display(){
		System.out.println("this is MyTestDemo's display()");
	}
}
public class FinalDemo {
	private final int i=0;
	private final int j;
	private final Book book;
	public FinalDemo(){
		j=i;
		book=new Book(10);
	}
	public FinalDemo(int j){
		this.j=j;
		book=new Book(12);
	}
	public static void main(String[] args){
		FinalDemo demo=new FinalDemo();
		FinalDemo demo2=new FinalDemo(20);
		
		MyTest test=new MyTest(23);
		test.show();
		System.out.println("================");
		MyTestDemo testDemo=new MyTestDemo(29);
		testDemo.display();
		MyTest test2=testDemo;
		
	}
}
