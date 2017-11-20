package org.cn.vo;

class ExceptionOne extends Exception{}
class ExceptionTwo extends ExceptionOne{}
public class MainException {
	public static void main(String[] args){
		try{
			throw new ExceptionTwo();
		}catch(ExceptionTwo e){
			e.printStackTrace(System.out);
		}catch(ExceptionOne e){
			e.printStackTrace(System.out);
		}
		
		try{
			throw new ExceptionTwo();
		}catch(ExceptionOne e){
			e.printStackTrace(System.out);
		}
	}
}
