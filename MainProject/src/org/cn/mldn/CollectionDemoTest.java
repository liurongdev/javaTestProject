package org.cn.mldn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Person1{};
class Student1 extends Person1{};
class Zhang extends Student1{};
class Liu extends Student1{};
class Worker extends Person1{};
class Famer extends Person1{};
public class CollectionDemoTest {
	public static void main(String [] args){
		List<Person1>list=Arrays.asList(new Worker(),new Student1());
		List<Person1>list2=new ArrayList<Person1>();
		Collections.addAll(list2,new Liu(),new Zhang());
		List<Person1> list3=Arrays.<Person1>asList(new Liu(),new Zhang());
		
	}
}
