package org.cn.vo.test;

import java.util.regex.Pattern;

public class StringDemo {
	private String info;
	public StringDemo(String info){
		this.info=info;
	}
	public boolean validate(){
		Pattern pattern=Pattern.compile("\\d+");
		if(info.matches(pattern.toString()))
			return true;
		return false;
	}
	public void println(String str){
		System.out.println(str);
	}
	public void println(int i){
		System.out.println(i);
	}
	public void println(char c){
		System.out.println(c);
	}
}
