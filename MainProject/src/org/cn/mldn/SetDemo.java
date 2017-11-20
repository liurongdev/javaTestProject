package org.cn.mldn;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args){
		Random rand=new Random(29);
		Set<Integer>set=new  HashSet<Integer>();
		for(int i=0;i<10000;i++){
			set.add(rand.nextInt(30));
		}
		//System.out.println(set  ); 
		
		
		
		Set<String>set2=new HashSet<String>();
		set2.addAll(Arrays.asList("a b c d e f g".split(" ")));
		set2.add("liurong");
		System.out.println(set2);
		Set<String>set3=new HashSet<String>();
		set3.add("a");
		Collections.addAll(set3, "b c".split(" "));
		System.out.println(set2.contains("a"));
		System.out.println(set2.containsAll(set3));
		set2.addAll(set2);
		System.out.println(set2);
	}
}
