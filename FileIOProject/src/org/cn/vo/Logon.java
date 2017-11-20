package org.cn.vo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Logon implements Serializable{
	private Date date=new Date();
	private String name;
	private transient String password;
	public Logon(String userName,String pwd){
		name=userName;
		password=pwd;
	}
	public String toString(){
		return "login info:\n"+"Date="+date+"\n"+"userName="+name+"\npassword="+password;
	}
	public static void main(String[] args) throws Exception{
		Logon logon=new Logon("liurong","cxx931219");
		System.out.println("logon:"+logon);
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("login.txt"));
		out.writeObject(logon);
		out.close();
		
		TimeUnit.SECONDS.sleep(10);
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("login.txt"));
		System.out.println("recovering object at:"+new Date());
		logon=(Logon)in.readObject();
		System.out.println("logon:"+logon);
		//in.close();
	}
}
