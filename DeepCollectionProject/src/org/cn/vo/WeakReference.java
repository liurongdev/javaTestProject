package org.cn.vo;

import java.util.WeakHashMap;

class Element{
	private String id;
	public Element(String ident){
		id=ident;
	}
	public String toString(){
		return id;
	}
	public int hadCode(){
		return id.hashCode();
	}
	public boolean equals(Object o){
		return o instanceof Element && id.equals(((Element)o).id);
		
	}
	protected void finalize(){
		System.out.println("finalize:"+getClass().getSimpleName()+" "+id);
	}
}
class Key extends Element{
	public Key(String key){
		super(key);
	}
}
class Value extends Element{
	public Value(String value){
		super(value);
	}
}
public class WeakReference {
	public static void main(String[] args){
		int size=1000;
		if(args.length>0){
			size=new Integer(args[0]);
		}
		Key[] keys=new Key[size];
		WeakHashMap<Key,Value>map=new WeakHashMap<Key,Value>();
		for(int i=0;i<size;i++){
			Key k=new Key(Integer.toString(i));
			Value v=new Value(Integer.toString(i));
			if(i%3==0){
				keys[i]=k;
			}
			map.put(k,v);
		}
		System.gc();
	}
}
