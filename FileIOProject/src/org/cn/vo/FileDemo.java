package org.cn.vo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class FileDemo {
	public static void main(String[] args) throws IOException{
		String file="FileDemo.out";
		BufferedReader in=new BufferedReader(new StringReader(new BufferedInputFile().read("FileDemo.java")));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter(file)));
		int count=0;
		String s;
		while((s=in.readLine())!=null){
			out.println(count++ +" ; "+s);
		}
		out.close();
		System.out.println(BufferedInputFile.read(file));
	}
}
