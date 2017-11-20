package org.cn.vo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class MainDemoTest {
	public static void main(String[] args) throws IOException{
		PrintStream console=System.out;
		BufferedInputStream in=new BufferedInputStream(new FileInputStream("MainDemoTest.java"));
		PrintStream out=new PrintStream(new BufferedOutputStream(new FileOutputStream("test.out")));
		System.setIn(in);
		System.setOut(out);
		System.setOut(out);
		String s;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while((s=br.readLine())!=null){
			System.out.println(s);
		}
		out.close();
		System.setOut(console);
	}
}
