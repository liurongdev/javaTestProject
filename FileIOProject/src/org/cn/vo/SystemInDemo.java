package org.cn.vo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInDemo {
	public static void main(String [] args) throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=reader.readLine())!=null && s.length()!=0){
			System.out.println(s);
		}
	}
}
