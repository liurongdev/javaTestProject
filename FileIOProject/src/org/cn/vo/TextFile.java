package org.cn.vo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class TextFile extends ArrayList<String> {
	public static String read(String fileName){
		StringBuilder sb=new StringBuilder();
		try{
			BufferedReader read=new BufferedReader(new FileReader(new File(fileName).getAbsolutePath()));
			try{
				String s;
				while((s=read.readLine())!=null){
					sb.append(s);
					sb.append("\n");
				}
			}finally{
				read.close();
			}
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return sb.toString();
	}
	public static void write(String fileName,String text){
		try{
			PrintWriter out=new PrintWriter(new FileWriter(new File(fileName).getAbsolutePath()));
			try{
				out.print(text);
			}finally{
				out.close();
			}
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		
	}
	public TextFile(String fileName,String splitter){
		super(Arrays.asList(read(fileName).split(splitter)));
		if(get(0).equals(""))
			remove(0);
	}
	public TextFile(String fileName){
		this(fileName,"\n");
	}
	public void writer(String fileName){
		try {
			PrintWriter out=new PrintWriter(new FileWriter(new File(fileName).getAbsolutePath()));
			try{
				for(String item:this){
					out.println(item);
				}
			}finally{
				out.close();
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}
	public static void main(String[] args){
		String file=read("TextFile.java");
		System.out.println("====================");
		System.out.println(file);
		System.out.println("+++++++++++++++++++++++++");
		write("test.txt",file);
		TextFile text=new TextFile("test.txt");
		System.out.println(new File("test.txt").getAbsolutePath());
		text.writer("test2.txt");
		TreeSet<String>words=new TreeSet<String>(new TextFile("TextFile.java","\\W+"));
		System.out.println(words.headSet("a"));
	}
}
