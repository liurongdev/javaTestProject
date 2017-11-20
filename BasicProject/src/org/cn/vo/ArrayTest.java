package org.cn.vo;

import java.util.Arrays;

public class ArrayTest {
	public <T> void test(T[] a ,T min,T max){
		T temp=a[(int) min];
		a[(int) min]=a[(int) max];
		a[(int) max]=temp;
	}
	public static void main(String[] args){
		ArrayTest test=new ArrayTest();
		int[] a={1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(a));
		
		
		
	}
}
