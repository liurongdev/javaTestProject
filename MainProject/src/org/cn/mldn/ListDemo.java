package org.cn.mldn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListDemo {
	public static void main(String [] args){
		Collection<Integer> collection=new ArrayList<Integer>(Arrays.asList(1,2,3));
		Integer[] int2={11,22,33};
		collection.addAll(Arrays.asList(int2));
		
		
		Collections.addAll(collection,4,5,5,6);
		Collections.addAll(collection, int2);
		System.out.println(collection);
		
		
		List<Integer>list2=Arrays.asList(0,9,323,2);
		list2.set(2, 1100);
		//list2.add(222);
		
		List<Integer>list3=new ArrayList<Integer>();
		list3.add(100);
		list3.add(1000);
		System.out.println(list3);
		
	}
}	
