package org.cn.vo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DaemonFromFactory implements Runnable{
	public void run(){
		try{
			while(true){
				TimeUnit.SECONDS.sleep(2);
				System.out.println(Thread.currentThread()+" "+this);
			}
		}catch(InterruptedException e){
			System.out.println("Interrupted");
		}
	}
	public static void main(String[] args) throws InterruptedException{
		ExecutorService executor=Executors.newCachedThreadPool(new DaemonThreadFactory());
		for(int i=0;i<10;i++){
			executor.execute(new DaemonFromFactory());
		}
		System.out.println("this is main");
		TimeUnit.SECONDS.sleep(3);
	}
}
