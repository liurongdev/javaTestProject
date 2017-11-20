package org.cn.vo;

class DemoTest{
	public void f(){
		System.out.println("!!!!!!!!!!");
	}
}
class Test<T>{
	private T obj;
	T[] zhang;
	public Test(T item){
		this.obj=item;
		zhang= (T[])new Object[100];
	}	
}
public class MainDemoTest {
	public static void main(String [] args){
		// demo=new DemoTest();
		//Test<DemoTest> test=new Test<DemoTest>(demo);
		//	test.show();
		Test<Integer>[] demo=new Test[100];
		System.out.println(demo.getClass().getSimpleName());
	}
}	
