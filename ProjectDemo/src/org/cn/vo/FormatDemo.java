package org.cn.vo;

public class FormatDemo {
	public static void main(String[] args){
		int a=10;
		double b=10.9;
		System.out.format("this is format output a=%d ; b=%f \n", a,b);
		System.out.printf("this is printf output a=%d ; b=%f", a,b);
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		String s1="123";
		String s2="-12344";
		String s3="+12132";
		String s4="\123";
		System.out.println(s1.matches("\\d+"));
		System.out.println(s2.matches("-?\\d+"));
		System.out.println(s1.matches("-\\d+"));
		System.out.println(s1.matches("-?\\d+"));
		System.out.println(s3.matches("(-|\\+)?\\d+"));
		System.out.println(s4.matches("(\\|\\-)?\\d+"));
	}
}
