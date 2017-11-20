package org.cn.vo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args){
		Set<String>set=new HashSet<String>();
		System.out.println(set.isEmpty());
		set.add("x");
		set.add("liurong");
		set.add("a");
		set.add("c");
		set.add("b");
		System.out.println(set);
		
		
		Set<Integer>set2=new HashSet<Integer>();
		test(set2);
		System.out.println(set2);
	
	}
	static void test(Set<Integer>set){
		for(int i=0;i<10;i++){
			set.add(i);
		}
		for(int i=0;i<10;i++){
			set.add(i);
		}
	}
}
