package org.cn.vo;

import java.util.ArrayList;
import java.util.List;

class Pelple{
	private int age;
	private String name;
	int getAge(){
		return age;
	}
	String getName(){
		return name;
	}
}
public class DemoTest {
	public static void main(String[] args){
		List<String>[] ls;
		List[] lo=new List[10];
		ls=(List<String>[])lo;
		ls[0]=new ArrayList<String>();
		System.out.println(ls);
		
		Object[] ob=ls;
		ob[0]=new ArrayList<Integer>();
		List<Pelple>[] list=(List<Pelple>[])new List[10];
		for(int i=0;i<list.length;i++){
			list[i]=new ArrayList<Pelple>();
			
		}
		System.out.println(list);
		
	}
}
