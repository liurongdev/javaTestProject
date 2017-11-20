package org.cn.DemoS;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String name=null;
		while(!(name=scan.nextLine()).equals("bye")){
			System.out.println(name);
		}
	}

}
