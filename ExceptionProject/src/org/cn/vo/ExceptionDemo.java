package org.cn.vo;

class MyException extends Exception{
	public MyException(){}
	public MyException(String info){
		super(info);
	}
}
public class ExceptionDemo {
	public static void f() throws MyException{
		System.out.println("f()-->MyException");
		throw new MyException();
	}
	public static void g() throws MyException{
		System.out.println("g()-->MyException(String info)");
		throw new MyException("this is MyException");
	}
	public static void main(String[] args){
		try {
			f();
		} catch (MyException e) {
			e.printStackTrace(System.out  );
		}
		try{
			g();
		}catch(MyException e){
			e.printStackTrace(System.err);
		}
	}
}
