package org.cn.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class CollectionMethodTest {
	public static void main(String[] args){
		List<String>list=Collections.nCopies(5, "liurong");
		System.out.println(list);
		String s=list.get(2);
		List<String>list2=new ArrayList<String>();
		list2.add("zhang");
		list2.add("cheng");
		list2.add("wang");
		list2.add("yang");
		list2.add("liu");
		list2.add("pang");
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);
		
		
		Vector<String> v=new Vector<String>();
		Enumeration<String>e=Collections.enumeration(list2);
		while( e.hasMoreElements()){
			v.addElement(e.nextElement());
		}
		ArrayList<String>list3=Collections.list(v.elements());
		System.out.println(list3);
	}
}
