package org.cn.vo;

import java.util.ArrayList;
import java.util.List;

public class Concatenation {
	public String toString(){
		return "Concatenation "+super.toString()+"\n";
	}
	public static void main(String [] args){
		List<Concatenation>list=new ArrayList<Concatenation>();
		for(int i=0;i<5;i++){
			list.add(new Concatenation());
		}
		System.out.println(list);
	}
}
