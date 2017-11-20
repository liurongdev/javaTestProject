package org.cn.mldn;

import java.util.ArrayList;

class Apple{
	private static long counter;
	private final long id=counter++;
	public long id(){
		return id;
	}
}
class Orange{
	
}
public class CollectionDemo {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		for(int i=0;i<3;i++){
			list.add(new Apple());
		}
		list.add(new Orange());                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
		
		for(int i=0;i<list.size();i++){
			System.out.println(((Apple)list.get(i)).id());
		}
	}
	
	

}
