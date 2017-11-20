package org.cn.vo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

interface A{
	void f();
}
class B implements A{
	public void f(){}
	public void g(){
		System.out.println("hello world");
	}
	private void m(){
		System.out.println("private Method m()");
	}
}
public class IntefaceDemo {
	public static A makeA1(){
		return new B();
	}
	public static void main(String[] args){
		A a=new B();
		A a4=makeA1();
	
		((B)a).f();
		System.out.println(a.getClass().getSimpleName());
		if(a instanceof B){
			B b=(B)a;
			b.g();
		}
		
		A a2=makeA1();
		System.out.println(a2.getClass().getName());
		A a3=makeA2();
		System.out.println(a3.getClass().getName());
		
		
		System.out.println("=====================");
		a4.f();
		callMethod(a4, "m");
		callMethod(a4,"g");
		System.out.println("======================");
	}
	public static A makeA(){
		return new A(){
			public void f(){
				System.out.println("this is f()");
			}
			public void g(){
				System.out.println("this is g()");
			}
		};
	}
	public static A makeA2(){
		return new A(){
			public void f(){
				System.out.println("this is f()");
			}
			public void g(){
				System.out.println("this is g()");
			}
			public void m(){
				System.out.println("this is m()");
			}
		};
	}
	public static void callMethod(Object object,String methodName){
		try {
			Method method=object.getClass().getDeclaredMethod(methodName);
			method.setAccessible(true);
			try {
				method.invoke(object);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
