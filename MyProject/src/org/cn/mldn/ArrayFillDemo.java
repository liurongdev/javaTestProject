package org.cn.mldn;

import java.util.Arrays;

public class ArrayFillDemo {
	public static void main(String[] args){
		int[] a=new int[7];
		int[] b=new int[10];
		Arrays.fill(a, 10);
		Arrays.fill(b,11);
		System.out.println("a="+Arrays.toString(a));
		System.out.println("b="+Arrays.toString(b));
		System.out.println(("====================="));
		System.arraycopy(a,2, b, 0, a.length-2);
		System.out.println("a="+Arrays.toString(a));
		System.out.println("b="+Arrays.toString(b));
	}
}
