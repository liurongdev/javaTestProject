package org.vo.cn;

class Person{
	private int age;
	class Destination{
		private String address;
		//private static int age=12;
		public Destination(String ar){
			address=ar;
		}
		public String getAddress(){
			return address;
		}
	}
	static class Student{
		private String school;
		public Student(String sh){
			school=sh;
		}
		public String getSchool(){
			return school;
		}
	}
	public Student getStudent(String school){
		return new Student(school);
	}
	public Destination getDestination(String address){
		return new Destination(address);
	}
}
public class InnerDemo {
	public static void main(String[] args){
		Person person=new Person();
		Person.Destination destination=person.new Destination("liurong");
		System.out.println(destination.getAddress());
		
		Person.Destination ds=person.getDestination("zhangsan");
		System.out.println(ds.getAddress());
		
		Person.Destination destnation2=person.new Destination("guangzhou");
		System.out.println(destnation2.getAddress());
		
		Person.Student student=person.getStudent("xixi");
		System.out.println(student.getSchool());
		Person.Student student2=new Person.Student("wanghuai");
		System.out.println(student2.getSchool());
	}
}
