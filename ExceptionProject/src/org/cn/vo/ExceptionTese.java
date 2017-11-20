package org.cn.vo;




public class ExceptionTese {
	static void f(){
		try{
			throw new Exception("throw Exception");
		}catch(Exception e){
			for(StackTraceElement elment:e.getStackTrace()){
				System.out.println(elment.getMethodName());
				//System.out.println(elment.getClassName());
				System.out.println(e.getMessage());
			}
		}
	}
	static void g(){
		f();
	}
	static void h(){
		g();
	}
	public static void main(String[] args){
		f();
		System.out.println("==========================");
		g();
		System.out.println("==============================");
		h();
		System.out.println("============================");
	}
}





















