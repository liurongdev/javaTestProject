package org.cn.vo;

import java.util.Arrays;

class Person<T>{
	public T[] f(T[] args){
		return args;
	}
}
class Student{
	public static<T> T[] g(T[] args){
		return args;
	}
}
public class MainTest {
	public static void main(String args[]){
		 Integer[] int1={1,2,3};
		 Double[] double1={1.1,1.2,1.3};
		 Integer[]int2=new Person<Integer>().f(int1);
		 Double[]double2=new Person<Double>().f(double1);
		 
		 
		 int2=Student.g(int1);
		 System.out.println(Arrays.toString(int2));
	}
}
