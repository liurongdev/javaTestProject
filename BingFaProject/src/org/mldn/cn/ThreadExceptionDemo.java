package org.mldn.cn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadDemo implements Runnable{
	public void run(){
		throw new RuntimeException();
	}
}
public class ThreadExceptionDemo {
	public static void main(String[] args){
		try{
			ExecutorService exe=Executors.newCachedThreadPool();
			exe.execute(new ThreadDemo());
		}catch(RuntimeException e){
			System.out.println("Exception has been handled");
		}
		
	}
}
