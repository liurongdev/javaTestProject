package org.mldn.cn;

class Demo{
	private Object syncObject=new Object();
	public synchronized void f(){
		for(int i=0;i<5;i++){
			System.out.println("f()"+i);
			Thread.yield();
		}
	}
	public void g(){
		synchronized(syncObject){
			for(int i=0;i<5;i++){
				System.out.println("g()"+i);
				Thread.yield();
			}
		}
	}
}
public class SynchDemo {
	public static void main(String[] args){
		final Demo demo=new Demo();
		new Thread(){
			public void run(){
				demo.f();
			}
		}.start();
		demo.g();
	}
}
