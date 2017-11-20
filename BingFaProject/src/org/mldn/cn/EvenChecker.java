package org.mldn.cn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenChecker implements Runnable{
	private IntGenerator generator;
	private final int id;
	public EvenChecker(IntGenerator g,int ident){
		this.generator=g;
		this.id=ident;
	}
	public void run(){
		while(!generator.isCancecled()){
			int val=generator.next();
			if(val%2 !=0){
				System.out.println(val+" not even");
				generator.cancel();
			}
		}
	}
	public static void test(IntGenerator gp,int count){
		System.out.println("Press Control-c to exit");
		ExecutorService exe=Executors.newCachedThreadPool();
		for(int i=0;i<count;i++){
			exe.execute(new EvenChecker(gp,i));
		}
		exe.shutdown();
	}
	public static void test(IntGenerator gp){
		test(gp,10);
	}
}
