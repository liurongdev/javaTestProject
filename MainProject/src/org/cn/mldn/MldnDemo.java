package org.cn.mldn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MldnDemo {
	public static void main(String[] args){
		Random rand=new Random(234);
		Integer [] a={1,2,3,4,5,6,7,8,9,10};
		List<Integer>list=new ArrayList<Integer>(Arrays.asList(a));
		System.out.println(list);
		Collections.shuffle(list,rand);
		System.out.println(list);
		System.out.println(Arrays.toString(a));
		
		
		System.out.println("@@@@@@@@@@@@@");
		
		List<Integer>list2=Arrays.asList(a);
		//list2.set(1, 100);
		System.out.println(list2);
		Collections.shuffle(list2,rand);
		System.out.println(list2);
		System.out.println(Arrays.toString(a));
		
		
		
	}
}
