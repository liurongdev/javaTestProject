package org.mldn.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class StringAddress{
	private String address;
	public StringAddress(String address){
		this.address=address;
	}
	public String toString(){
		return super.toString()+" "+address;
	}
}
public class FillListDemo {
	public static void main(String[] args){
		List<StringAddress>list=new ArrayList<StringAddress>(Collections.nCopies(4, new StringAddress("liurong")));
		System.out.println(list);
		Collections.fill(list, new StringAddress("xixi"));
		System.out.println(list);
		List<String>list2=new ArrayList<String>();
		list2.add("hello");
		list2.add("world");
		Collections.fill(list2, "zhangsan");  //fill()方法只能替换集合中已经存在的元素
		System.out.println(list2.toString());
	}
}
