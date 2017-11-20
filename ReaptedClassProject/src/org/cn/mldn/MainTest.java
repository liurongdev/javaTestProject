package org.cn.mldn;
class Sup{
	public String name="liurong";
	public int field=0;
	public int getField(){
		return field;
	}
}
class Sub extends Sup{
	public int field=1;
	public int getField(){
		return field;
	}
	public int getSuperField(){
		return super.field;
	}
	
}
public class MainTest {
	public static void main(String[] args){
		Sup sup=new Sub();
		System.out.println("filed="+sup.getField());
		System.out.println("field="+sup.field);
		
		Sub sub=new Sub();
		System.out.println("Sub's Filed="+sub.field);
		System.out.println("Sub's getFild="+sub.getField());
		System.out.println("Sub's getSuperFiled="+sub.getSuperField());
		System.out.println("Sub's name="+sub.name);
	}
}
