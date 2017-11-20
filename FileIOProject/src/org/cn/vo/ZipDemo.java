package org.cn.vo;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class ZipDemo {
	public static void main(String[] args) throws Exception{
		if(args.length==0){
			System.out.println("args.length==0,please imput fileName to cmopress");
			System.exit(2);
		}
		BufferedReader in=new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
		BufferedOutputStream out=new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream("test.gz")));
		int c;
		System.out.println("read file");
		while((c=in.read())!=-1){
			out.write(c);
		}
		in.close();
		out.close();
		System.out.println("write file");
		
		BufferedReader in2=new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream("test.gz"))));
		String s;
		while((s=in2.readLine())!=null){
			System.out.println(s);
		}
		in2.close();
		
	}
}
