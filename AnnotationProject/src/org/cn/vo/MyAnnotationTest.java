package org.cn.vo;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyAnnotationTest {
	public static void  annotationTest(List<Integer>list,Class<?>c){
		for(Method method:c.getDeclaredMethods()){
			MyAnnotation ma=method.getAnnotation(MyAnnotation.class);
			if(ma!=null){
				System.out.println("founding MyAnnotation:"+ma.id()+"   "+ma.description());
				list.remove(new Integer(ma.id()));
			}
		}
		for(int id:list){
			System.out.println("Missing annotation id:"+id);
		}
	}
	public static void main(String[] args){
		List<Integer>list=new ArrayList<Integer>();
		Collections.addAll(list, 23,24,25,26);
		annotationTest(list,AnnotationDemo.class);
		
		System.out.println("liurong ,".substring(0, "liurong ,".length()-1));
	}
}	
