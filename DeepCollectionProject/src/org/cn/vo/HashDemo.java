package org.cn.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CountedString{
	private static List<String>created=new ArrayList<String>();
	private String s;
	private int id=0;
	public CountedString(String s2){
		s=s2;
		created.add(s);
		for(String s1:created){
			if(s.equals(s1)){
				id++;
			}
		}
	}
	public String toString(){
		return "String:"+s+"; id:"+id+";hashCode:"+hashCode();
	}
	public int hashCode(){
		int result=17;
		result=37*result+s.hashCode();
		result=37*result+id;
		return result;
	}
}
public class HashDemo {
	public static void main(String[] args){
		Map<CountedString,Integer>map=new HashMap<CountedString,Integer>();
		CountedString[] c5=new CountedString[5];
		for(int i=0;i<c5.length;i++){
			c5[i]=new CountedString("hi");
			map.put(c5[i], i);
		}
		System.out.println(map);
		System.out.println("==============");
		for(CountedString s:c5){
			System.out.println("Looking Up:"+s);
			System.out.println(map.get(s));
		}
		System.out.println(3/2);
		System.out.println(3%2);
	} 
}










