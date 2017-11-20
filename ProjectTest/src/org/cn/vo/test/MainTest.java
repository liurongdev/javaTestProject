package org.cn.vo.test;

import java.lang.reflect.Method;

class Person{
	public void speek(){
		System.out.println("this is person->speek()");
	}
	public String get(){
		return "Person";
	}
}
class Student{
	public void study(){
		System.out.println("this is student's study()");
	}
	public String get(){
		return "Study";
	}
}
class Reflectively{
	public static void perform(Object speaker){
		Class<?> spk=speaker.getClass();
		try{
			try {
				Method speek=spk.getMethod("speek");
				speek.invoke(speaker);
			} catch (NoSuchMethodException e) {
				System.out.println(speaker+" cannot speek()");
			}
			try {
				Method study=spk.getMethod("study");
				study.invoke(speaker);
			} catch (NoSuchMethodException e) {
				System.out.println(speaker+" cannot study()");
			}
		}catch(Exception e){
			throw new RuntimeException(speaker.toString(),e);
		}
		
	}
}
public class MainTest {
	public static void main(String[] args){
		new Reflectively().perform(new Person());
		new Reflectively().perform(new Student());
	}
}
