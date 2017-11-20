package org.vo.cn;
class Egg{
	private Person person;
	protected class Person{
		public Person(){
			System.out.println("Egg's Person");
		}
	}
	public Egg(){
		System.out.println("Egg's Contructor");
		person=new Person();
	}
}
 public class BigEgg extends Egg{
	 public class Person extends Egg.Person{
		 public Person(){
			 System.out.println("BigEgg's  Person");
		 }
	 }
	public static void main(String[] args){
		Egg egg=new BigEgg();
	}
}
