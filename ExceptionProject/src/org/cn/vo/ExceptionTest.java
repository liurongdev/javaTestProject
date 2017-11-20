package org.cn.vo;
class ImportException extends Exception{
	public String toString(){
		return "ImportException";
	}
}
class MyException2 extends Exception{
	public String toString(){
		return "this is MyException";
	}
}
public class ExceptionTest {
	 void f() throws ImportException{
		throw new  ImportException();
	}
	 void dispose() throws MyException2{
		throw new MyException2();
	}
	public static void main(String[] args){
		try{
			ExceptionTest test=new ExceptionTest();
			try{
				test.f();
			}finally{
				test.dispose();
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}



