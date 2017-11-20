package org.cn.mldn;

import java.io.FileNotFoundException;
import java.io.IOException;

class GetException{
	public void throwException(int i){
		try{
			switch(i){
			case 0: throw new FileNotFoundException("FileNotFoundException");
			case 1: throw new IOException("IOException");
			case 2: throw new RuntimeException("who l am ?");
			default:
				return;
			}
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
}
class SimpleException extends Exception{}
class ExceptionDemo {
	public static void main(String[] args){
		GetException ge=new GetException();
		ge.throwException(3);
		
		for(int i=0;i<4;i++){
			try{
				if(i<3){
					ge.throwException(i);
				}else{
					throw new SimpleException();
				}
			}catch(SimpleException e){
				e.printStackTrace(System.out);
			}catch(RuntimeException e){
				try{
					throw e.getCause();
				}catch(FileNotFoundException e1){
					e1.printStackTrace(System.out);
				}catch(IOException e2){
					e2.printStackTrace(System.out);
				}catch(Throwable e3){
					System.out.println(e3);
				}
			}
		}
	}
}
