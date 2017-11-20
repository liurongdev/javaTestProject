package org.cn.mldn;
import java.util.LinkedList;

class Stack<T>{
	private LinkedList<T> storage=new LinkedList<T>();
	public void push(T t){
		storage.addFirst(t);
	}
	public T pop(){
		return storage.getFirst();
	}
	public T peek(){
		return storage.removeFirst();
	}
	public boolean isEmpty(){
		return storage.isEmpty();
	}
	public String toString(){
		return storage.toString();
	}
}
public class IteratorDemo {
	public static void main(String [] args){
		Stack<String> stack=new Stack<String>();
		for(String s:"hello xixi l am liurong".split(" ")){
			stack.push(s);
		}
		
		while(!stack.isEmpty()){
			System.out.println(stack.peek());
		}
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!");
		java.util.Stack<String> stack2=new java.util.Stack<String>();
		for(String s:"hello this is beijing".split(" ")){
			stack2.push(s);
		}
		while(!stack2.isEmpty()){
			System.out.println(stack2.pop());
		}
	}
}
