package org.vo.cn;
class Fruit{
	private String name;
	class Apple{
		public Fruit getFruit(){
			return Fruit.this;
		}
	}
	static class Orange{
		private String address;
		public Orange(String ar){
			address=ar;
		}
		public String getAddress(){
			return address;
		}
	}
	public static Orange getOrange(String address){
		return new Orange(address);
	}
	
}
public class InnerMain {
	public static void main(String[] args){
		Fruit fruit1=new Fruit();
		Fruit.Apple apple=fruit1.new Apple();
		Fruit fruit2=apple.getFruit();
		System.out.println(fruit1==fruit2);
		
		Fruit.Orange orange=new Fruit.Orange("xixi");
		Fruit.Apple apple2=fruit1.new Apple();
		
	}
}
