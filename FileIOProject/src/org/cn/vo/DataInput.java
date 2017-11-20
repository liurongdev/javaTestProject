package org.cn.vo;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInput {
	public static void main(String[] args) throws IOException{
		/*
		 * 
		 * DataInputStream in=new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read("DataInput.java").getBytes()));
		 * while(true){
			System.out.println((char)in.readByte());
		}
		 */
		DataInputStream  in=new DataInputStream(new BufferedInputStream(new FileInputStream("DataInput.java")));
		while(in.available()!=0){
			System.out.println((char)in.readByte());
		}
		
	}
}
