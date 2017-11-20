package org.cn.vo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimplePrioritiesDemo implements Runnable{
	private int countDown=5;
	private volatile double d;
	private int priority;
	public SimplePrioritiesDemo(int priority){
		this.priority=priority;
	}
	public String toString(){
		return Thread.currentThread()+";" +countDown;
	}
	public void run(){
		Thread.currentThread().setPriority(priority);
		while(true){
			for(int i=0;i<20000;i++){
				d+=(Math.PI+Math.E)/(double)i;
				if(i%1000==0){
					Thread.yield();
				}
			}
			System.out.println(this);
			if(--countDown==0)
			return;
		}
	}
	public static void main(String[] args){
		ExecutorService executor=Executors.newCachedThreadPool();
		for(int i=0;i<5;i++){
			executor.execute(new SimplePrioritiesDemo(Thread.MIN_PRIORITY));
		}
		executor.execute(new SimplePrioritiesDemo(Thread.MAX_PRIORITY));
		executor.shutdown();
	}
}
