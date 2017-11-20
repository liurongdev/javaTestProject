package org.cn.vo;

import java.io.IOException;
import java.io.StringReader;

public class StringReadDemo {
	public static void main(String[] args) throws IOException{
		StringReader read=new StringReader(BufferedInputFile.read("BufferedInputFile.java"));
		int c;
		while((c=read.read())!=-1){
			System.out.print((char)c);
		}
	}
}
