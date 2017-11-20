package org.cn.vo;

class TestClass{
	private class PContents implements Contents{
		private int value=11;
		public int value(){
			return value;
		}
	}
	private class PDestinations implements Destinations{
		private String name;
		public PDestinations(String name){
			this.name=name;
		}
		public String readLine(){
			System.out.println("name=="+name);
			return name;
		}
	}
	public Contents getContents(){
		return new PContents();
	}
	public Destinations getDestinations(){
		return new PDestinations("liurong");
	}
}
public class TestMain {
	
	public static void main(String args[]){
		TestClass test=new TestClass();
		Contents content=test.getContents();
		Destinations destination=test.getDestinations();
		System.out.println(content.value());
		destination.readLine();
	}  
}
