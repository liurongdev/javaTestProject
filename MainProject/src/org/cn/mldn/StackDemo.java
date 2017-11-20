package org.cn.mldn;

import java.util.Iterator;
import java.util.Random;

interface Generator<T>{
	T next();
}
class Coffee{
	private static long counter=0;
	private final long id=counter++;
	public String toString(){
		return getClass().getSimpleName()+" "+ id;
	}
}
class Yang extends Coffee{}
class Wang extends Coffee{}
class Cheng extends Coffee{}
public class StackDemo implements Generator<Coffee>,Iterable<Coffee>{
	private int size;
	private Class[] types={
			Yang.class,Wang.class,Cheng.class,Coffee.class
	};
	private Random rand=new Random(39);
	public StackDemo(){}
	public StackDemo(int size){
		this.size=size;
	}
	public Coffee next(){
		try {
			return (Coffee) types[rand.nextInt(types.length)].newInstance();
		} catch (Exception e){
			throw new RuntimeException(e);
		}
	}
	private class CoffeeIterator implements Iterator<Coffee>{
		private int count=size;
		@Override
		public boolean hasNext() {
			//System.out.println("xixi");
			System.out.println("hasNext===>");
			return count>0;
		}

		@Override
		public Coffee next() {
			System.out.println("next()==>");
			count--;
			return StackDemo.this.next();
		}
		public void remove(){
			throw new UnsupportedOperationException();
		}
	}
	@Override
	public Iterator<Coffee> iterator() {
		System.out.println("liurong");
		return new CoffeeIterator();
	}
	public static void main(String[] args){
		StackDemo stack=new StackDemo();
		for(int i=0;i<5;i++){
			System.out.println(stack.next());
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");
		for(Coffee c:new StackDemo(5)){
			System.out.println("hello");
			System.out.println(c);
		}
	}

	
}
