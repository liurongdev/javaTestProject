package org.cn.vo;

import java.util.Arrays;
import java.util.Random;

class Value{
	int i;
	Value(int i){
		this.i=i;
	}
}
public class FinalTest {
	private String id;
	public FinalTest(String id){
		this.id=id;
	}
	private static Random rand=new Random(100);
	private final int valueOne=9;
	private static final int valueTwo=10;
	public static final int valueThree=11;
	private final int i4=rand.nextInt(10);
	static final int i5=rand.nextInt(12);
	private Value value1=new Value(20);
	private final Value value2=new Value(22);
	private static final Value value3=new Value(23);
	private final int[] a={1,2,3,34,4};
	public String toString(){
		return id+" ;"+" i4="+i4+"; i5="+i5;
	}
	public static void main(String[] args){
		FinalTest test=new FinalTest("liurong");
		System.out.println(test);
		System.out.println("=================");
		test.id="zhangsan";
		System.out.println(test);
		System.out.println("===================");
		Value value=new Value(33);
		//test.value2=value;
		System.out.println(test.value2.i);
		test.value2.i=100;
		System.out.println(test.value2.i);
		System.out.println(Arrays.toString(test.a));
		for(int i=0;i<test.a.length;i++){
			test.a[i]=i+3;
		}
		System.out.println(Arrays.toString(test.a));
		System.out.println("=======================");
		
		System.out.println(test.value3.i);
		test.value3.i=230;
		System.out.println(test.value3.i);
		
		System.out.println("222222222222222222222222");
		FinalTest test2=new FinalTest("xixi");
		System.out.println(test2);
		//test2=test;
		//System.out.println(test2);
		//test2.id="woshi liurong";
		//System.out.println(test);
		
		
	}
}
