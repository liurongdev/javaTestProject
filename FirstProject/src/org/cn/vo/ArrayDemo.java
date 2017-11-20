package org.cn.vo;
class  Demo<T>{}
public class ArrayDemo {
	private static Demo<Integer>[] demo;
	private static final int  SIZE=100;
	public static void main(String[] args){
		demo=(Demo<Integer>[])new Demo[SIZE];
		System.out.println(demo.getClass().getSimpleName());
		demo[0]=new Demo<Integer>();
		//demo[1]=new Object();
	}
}


