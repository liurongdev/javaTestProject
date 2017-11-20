package org.cn.vo;

import java.util.Arrays;

public class MainDemo {
	public static void main(String args[]){
		int size=6;
		int [] a1=new int[size];
		long[] a2=new long[size];
		double[] a3=new double[size];
		short [] a4=new short[size];
		char[] a5=new char[size];
		String [] a6=new String[size];
		boolean[] a7=new boolean[size];
		byte[] a8=new byte[size];
		
		Arrays.fill(a1, 10);
		System.out.println("a1="+Arrays.toString(a1));
		Arrays.fill(a2, 10);
		System.out.println("a2"+Arrays.toString(a2));
		Arrays.fill(a7, true);
		System.out.println("a7"+Arrays.toString(a7));
		Arrays.fill(a6, "liurong");
		System.out.println(Arrays.toString(a6));
		
		Arrays.fill(a6, 2,5,"xixi");
		System.out.println(Arrays.toString(a6));
		
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
		int[] i=new int[10];
		int[] j=new int[12];
		Arrays.fill(i, 10);
		Arrays.fill(j, 12);
		System.out.println(Arrays.toString(i));
		System.out.println(Arrays.toString(j));
		System.arraycopy(i, 0, j, 0, i.length);
		System.out.println(Arrays.toString(i));
		System.out.println(Arrays.toString(j));
		
		int[] k=new int[5];
		Arrays.fill(k, 2);
		System.out.println(Arrays.toString(k));
		System.arraycopy(i, 0, k, 0, k.length);
		System.out.println(Arrays.toString(k));
		
		
		Integer[] x=new Integer[5];
		Integer[] y=new Integer[10];
		Arrays.fill(x, new Integer(4));
		Arrays.fill(y, new Integer(7));
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		
		System.arraycopy(x, 0, y, y.length/2,x.length);
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		
		System.out.println("!!!!!!!!!!!!!!!!!!!");
		int[] m=new int[size];
		int[] n=new int[size];
		Arrays.fill(m, 10);
		Arrays.fill(n, 10);
		System.out.println(Arrays.equals(m, n));
		n[3]=100;
		System.out.println(Arrays.equals(m,n));
		String[] str=new String[4];
		Arrays.fill(str, "liurong");
		String[]str2=new String[]{
				new String("liurong"),new String("liurong"),new String("liurong"),new String("liurong")
		};
		System.out.println(Arrays.equals(str, str2));
		  
		
		int[] aa={1,3,24,54,3};
		System.out.println(Arrays.toString(aa));
		Arrays.sort(aa);
		System.out.println(Arrays.toString(aa));
		
		int location=Arrays.binarySearch(aa, 100);
		System.out.println(location);
		

	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
