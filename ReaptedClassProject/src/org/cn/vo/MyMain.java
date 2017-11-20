package org.cn.vo;
class Man{
	public Man(){
		System.out.println("this is Man");
	}
}
class One {
	private int i;
	private int k=getValue();
	private static  Man man=new Man();
	private Man man3=new Man();
	private static String name;
	private static int count=0;
	public One(int i){
		System.out.println("one's constructor i="+i);
		this.i=i;
	}
	static int getValue(){
		System.out.println("One's static Method getValue()"+count++);
		return 10;
	}
	static{
		System.out.println("this is One's static");
		name="liurong";
	}
	
}
class Two extends One{
	private int age;
	public Two(int i){
		super(i);
		System.out.println("11111111111111");
		this.age=i;
	}
	private static Man man0=new Man();
//	private static One one=new One(111); 
	
}
public class MyMain extends One{
	private int kk;
	private int i;
	private static String name;
	
	private Man man2=new Man();
    private static Man man=new Man();
	static{	
		System.out.println("name="+name);
		name="xixixixi";
		System.out.println("name="+name);
	}
	
	{
		System.out.println("--------------");
		name="zhangsan";
		System.out.println("-------------------");
	}
	
	public MyMain(int i){
		super(i);
		System.out.println("!!!!!!!!!!!!!!");
		System.out.println("i="+i+"; kk	="+kk);
	}
	public static void main(String[] args){
		MyMain main=new MyMain(2);
		System.out.println("@@@@@@@@@@@@@@@@");
		System.out.println("name="+name);
		//System.out.println("man2="+man2);
		Two two=new Two(22);
		System.out.println("======================");		
	}
}
