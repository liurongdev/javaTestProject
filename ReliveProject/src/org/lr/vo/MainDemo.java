package org.lr.vo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainDemo {
	public static void main(String args[]) throws IOException{
		DataOutputStream out=new DataOutputStream(new BufferedOutputStream(
					new FileOutputStream("data.txt")));
		out.writeInt(120);
		out.writeDouble(100.0);
		out.writeUTF("hello liurong");
		out.writeBoolean(true);
		out.close();
		
		DataInputStream input=new DataInputStream(new BufferedInputStream (new FileInputStream
					("data.txt")));
		System.out.println(input.readInt());
		System.out.println(input.readDouble());
		System.out.println(input.readUTF());
		System.out.println(input.readBoolean());
		input.close();
		
	}
}
