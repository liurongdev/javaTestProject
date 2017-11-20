package org.cn.vo;

import java.util.LinkedList;
import java.util.Stack;

enum Name{
	LIU,ZHANG,CHENG,YANG,WANG,HE,XI,LI,ZHOU,ZENG,ZHAO
}
public class StackDemo {
	public static void main(String[] args){
		Stack<String> stack=new Stack<String>();
		for(Name name:Name.values()){
			stack.push(name.toString());
		}
		System.out.println(stack);
		stack.addElement("xixi");
		System.out.println("element 5="+stack.elementAt(5));
		System.out.println("poping Elements:");
		while(!stack.isEmpty()){
			System.out.print(stack.pop()+" ");
		}
		System.out.println("\n"+stack+"\n");
		LinkedList<String>link=new LinkedList<String>();
		for(Name name:Name.values()){
			link.addFirst(name.toString());
		}
		System.out.println(link);
		
		System.out.println("\n");
		while(!link.isEmpty()){
			System.out.print(link.removeFirst()+" ");
		}
	}
}
