package org.cn.vo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestAlien {
	public static void main(String[] args) throws Exception{
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("File.txt"));
		Alien alien=new Alien();
		out.writeObject(alien);
	}
}
