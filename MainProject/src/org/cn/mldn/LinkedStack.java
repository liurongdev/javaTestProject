package org.cn.mldn;

public class LinkedStack<T>{
	private static class Node<U>{
		private U item;
		private Node<U> next;
		public Node(){
			this.item=null;
			this.next=null;
		}
		public Node(U item,Node<U> next){
			this.item=item;
			this.next=next;
		}
		boolean end(){
			return item==null && next==null;
		}
	}
	private Node<T> top=new Node<T>();
	public void push(T item){
		top=new Node<T>(item,top);
	}
	public  T pop(){
		T result=top.item;
		if(!top.end()){
			top=top.next;
		}
		return result;
	}
	public static void main(String [] args){
		LinkedStack<String> stack=new LinkedStack<String>();
		for(String s:"liurong xixi zhang cheng".split(" ")){
			stack.push(s);
		}
		String s;
		while((s=stack.pop())!=null){
			System.out.println(s);
		}
	}
}
