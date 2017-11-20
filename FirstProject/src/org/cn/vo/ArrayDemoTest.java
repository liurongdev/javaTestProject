package org.cn.vo;

import java.util.Arrays;

class GenericArray<T>{
	private Object[] object;
	public GenericArray(int size){
		object=new Object[size];
	}
	public void put(int i,T item){
		object[i]=item;
	}
	public T[] get(){
		return (T[])object;
	}
	public T getItem(int index){
		return (T)object[index];
	}
}
public class ArrayDemoTest {
	public static void main(String[] args){
		GenericArray<Integer> array=new GenericArray<Integer>(10);
		for(int i=0;i<10;i++){
			array.put(i, i);
		}
		for(int i=0;i<10;i++){
			System.out.print(array.getItem(i)+" ");
		}
		try{
			Object[] object=array.get();
			System.out.println(Arrays.toString(object));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
