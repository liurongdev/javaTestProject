package org.cn.vo;

import org.cn.demo.MainDemo;

public class DemoTest {
	public static void main(String [] args){
		MainDemo demo=new MainDemo();
		demo.f2();
	}

}


class MyTest extends MainDemo{
	public  static void main(String[] args){
		System.out.println("this is MyTest()");
	}
	public void show(){
		f2();
		f3();
		//f4();
	}
}
