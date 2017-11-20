package org.cn.vo;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args){
		System.out.println("hello java");
		Demo.main(new String[]{"hello" ,"liurong","xixi"});
		//Demo.main({new String("xixi"),new String("zhang")});
	}
}
class Demo{
	public static void main(String [] args){
		System.out.println(Arrays.toString(args));
		System.out.println("myName");
	}
}

