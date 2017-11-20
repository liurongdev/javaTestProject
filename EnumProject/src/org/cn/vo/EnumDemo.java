package org.cn.vo;
import java.lang.reflect.*;

enum Name{
	LIU,CHENG,ZHANG,WANG,YANG,WU
}
public class EnumDemo {
	public static void main(String[] args){
		for(Name name:Name.values()){
			System.out.println(name+" ordinal :"+name.ordinal());
			System.out.println(name.compareTo(Name.ZHANG));
			System.out.println(name.equals(Name.ZHANG));
			System.out.println(name==Name.ZHANG);
			System.out.println(name.getDeclaringClass());
			System.out.println(name.name());
			System.out.println("=============-");
		}
		for(String s:"LIU CHENG ZHANG WANG YANG".split(" ")){
			Name name=Enum.valueOf(Name.class, s);
			System.out.println(name);
		}
		
	}
}
