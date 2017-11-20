package org.cn.vo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionMethodDemo {
	public static void main(String[] args){
		Collection<String>c=new ArrayList<String>();
		List<String>list=new ArrayList<String>(Arrays.asList("liurong","xixi","yang","wang"));
		System.out.println(list);
		c.addAll(list);
		System.out.println(c);
		c.add("cheng");
		System.out.println(c);
		System.out.println("================");
		Object[] array=c.toArray();
		String[] str=c.toArray(new String[0]);
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(array));
		System.out.println("c(max)="+Collections.max(c));
		System.out.println("min="+Collections.min(c));
		List<String>list2=new ArrayList<String>();
		list2.add("rong");
		list2.add("Z");
		list2.add("x");
		list.addAll(list2);
		System.out.println(list);
		System.out.println(list.contains("Z"));
		System.out.println("list remove x:"+list.remove("x"));
		System.out.println(list.removeAll(list2));
		System.out.println(list);
		System.out.println("=================");
		list.addAll(list2);
		List<String>list3=new ArrayList<String>();
		list3.add("xixi");
		list3.add("liurong");
		System.out.println(list3.retainAll(list));
		System.out.println(list.retainAll(list3));
		List<String>c2=((List<String>)list).subList(0, 2);
		System.out.println(c2);
		System.out.println(list.size()+";"+list);
		list.clear();
		System.out.println(list);
		
	}
}
