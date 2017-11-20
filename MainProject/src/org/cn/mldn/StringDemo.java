package org.cn.mldn;

import java.util.Scanner;
public class StringDemo {
	private static final String info="l am liurong\n23 18.0";
	public static void main(String [] args){                                                                                                                  
		Scanner scanner=new Scanner(info);
		String name=scanner.nextLine();
		int age=scanner.nextInt();
		double favorate=scanner.nextDouble();
		System.out.println(favorate);
		System.out.println("your name is:"+name);
		System.out.format("your age id %d", age);
		System.out.println();
		System.out.format("you favorate double is %f;",favorate/2 );
		
		System.out.println("hello ajva");
	}
}
