package org.cn.vo;

import java.lang.reflect.Field;

class Worker{
	private String name="lirong";
	private final String s="xixi";
	private int i=1;
	public String toString(){
		return i+" "+name+"; "+s;
	}
	public void setInt(int i){
		this.i=i;
	}
}
public class FieldDemo {
	public static void main(String[]args) throws Exception{
		Worker worker=new Worker();
		Field f=worker.getClass().getDeclaredField("i");
		f.setAccessible(true);
		f.setInt(worker, 22);
		System.out.println(worker);
		f=worker.getClass().getDeclaredField("name");
		f.setAccessible(true);
		f.set(worker, "hello");
		System.out.println(worker);
		Worker worker2=new Worker();
		System.out.println(worker2);
		worker2=worker;
		worker2.setInt(200);
		System.out.println(worker2+"\n"+worker);
		
	}
}
