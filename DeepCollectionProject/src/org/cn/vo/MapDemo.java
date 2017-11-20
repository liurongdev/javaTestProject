package org.cn.vo;

import java.util.LinkedHashMap;

public class MapDemo {
	public static void main(String[] args){
		LinkedHashMap<Integer,String>map=new LinkedHashMap<Integer,String>();
		map.put(1, "liurong");
		map.put(2, "xixi");
		map.put(3, "zhang");
		map.put(4, "wang");
		map.put(5, "cheng");
		map.put(6, "yang");
		System.out.println(map);
		System.out.println("---------------------");
		map=null;
		map=new LinkedHashMap<Integer,String>(16,0.75f,true);
		map.put(0,"liu");
		map.put(1, "liurong");
		map.put(2, "xixi");
		map.put(3, "zhang");
		map.put(4, "wang");
		map.put(5, "cheng");
		map.put(6, "yang");
		System.out.println(map);
		for(int i=0;i<3;i++){
			map.get(i);
		}
		System.out.println(map);
		map.get(0);
		System.out.println(map);
	}
}
