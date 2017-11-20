package org.cn.mldn;

import java.util.ArrayList;
import java.util.List;

public class MethodDemo {
   static <T>  List<T> makeList(T... args){
		List<T>list=new ArrayList<T>();
		for(T s:args){
			list.add(s);
		}
		return list;
	}
	public static void main(String[] args){
		List<String>list=makeList("liurong");
		System.out.println(list);
		
	}
}
