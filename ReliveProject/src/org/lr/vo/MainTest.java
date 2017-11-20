package org.lr.vo;

import java.util.Arrays;

class Process{
	public String name(){
		return getClass().getSimpleName();
	}
	Object process(Object input){
		return input;
	}
}
class toUpper extends Process{
	String process(Object input){
		return ((String)input).toUpperCase();
	}
}
class toLower extends Process{
	String process(Object input){
		return ((String)input).toLowerCase();
	}
}
class Splitter extends Process{
	String process(Object input){
		return Arrays.toString(((String)input).split(" "));
	}
}
public class MainTest {
	public static void process(Process p,String s){
		System.out.println("p.name="+p.name());
		System.out.println(p.process(s));
	}
	public static String s="hello l am LIURONG who are you?";
	public static void main(String args[]){
		process(new Process(),s);
		process(new toUpper(),s);
		process(new toLower(),s);
		process(new Splitter(),s);
	}
}
