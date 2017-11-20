package org.cn.vo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainAlien {
	public static void main(String[] args) throws Exception{
		ObjectInputStream in=new ObjectInputStream(new FileInputStream(new File("..","File.txt")));
		Object o=in.readObject();
		System.out.println(o.getClass());
	}
}
