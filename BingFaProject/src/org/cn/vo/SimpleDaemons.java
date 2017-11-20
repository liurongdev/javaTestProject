package org.cn.vo;

import java.util.concurrent.TimeUnit;

public class SimpleDaemons implements Runnable{
	public void run(){
		try{
			while(true){
				//System.out.println("-----------");
				TimeUnit.SECONDS.sleep(4);
				System.out.println(Thread.currentThread()+" "+this);
			}
		}catch(InterruptedException e){
			System.out.println("interrupted");
		}
	}
	public static void main(String[] args) throws InterruptedException{
		for(int i=0;i<10;i++){
			Thread demo=new Thread(new SimpleDaemons());
			demo.setDaemon(true);
			demo.start();
		}
		System.out.println("this is main");
		TimeUnit.SECONDS.sleep(5);
		System.out.println("main stop");
	}
}
