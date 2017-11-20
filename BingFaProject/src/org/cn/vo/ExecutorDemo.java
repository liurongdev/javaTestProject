package org.cn.vo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
	public static void main(String[] args){
		ExecutorService executor=Executors.newCachedThreadPool();
		for(int i=0;i<5;i++){
			executor.execute(new LiftOff());
		}
		System.out.println("this is main");
		executor.shutdown();
		//executor.execute(new LiftOff());
		
	}
}
       