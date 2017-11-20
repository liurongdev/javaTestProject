package org.cn.vo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ReadOnly {
	public static void main(String[] args){
		List<String>list=new ArrayList<String>(Arrays.asList("zhang xixi cheng wang yang".split(" ")));
		Collection<String>list2= Collections.unmodifiableCollection(list);
		System.out.println(list2);
		Set<String>set=Collections.unmodifiableSet(new TreeSet<String>(list));
		System.out.println(set);
		//set.add("xhang");
		System.out.println("-=================");
		Collection<String>c=new ArrayList<String>();
		Iterator<String>iter=c.iterator();
		c.add("zhang");
		try{
			String s=iter.next();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
