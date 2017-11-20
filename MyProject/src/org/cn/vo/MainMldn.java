package org.cn.vo;

public class MainMldn {
	void f(){
		System.out.println("hello this is f()");
	}
	public class Inner{         
		public MainMldn outter(){
			return MainMldn.this;
		}
		public void show(){
			System.out.println("hello this is inner()");
		}
	}
	public Inner getInner(){
		return new Inner();
	}
	public static void main(String args[]){
		MainMldn mldn=new MainMldn();
		MainMldn.Inner inner=mldn.getInner();
		inner.outter().f();
		
		Inner inner2=mldn.getInner();
		inner2.show();
	}
}
