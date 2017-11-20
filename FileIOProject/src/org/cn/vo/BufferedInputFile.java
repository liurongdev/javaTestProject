package org.cn.vo;

import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputFile {
	public static String read(String fileName)throws IOException{
		BufferedReader read=new BufferedReader(new FileReader(fileName));
		StringBuilder sb=new StringBuilder();
		String s;
		while((s=read.readLine())!=null){
			sb.append(s);
		}
		read.close();
		return sb.toString();
	}
	public static void main(String[] args){
		try {
			System.out.println(read("BufferedInputFile.java"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
