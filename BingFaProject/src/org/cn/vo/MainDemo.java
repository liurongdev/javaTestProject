package org.cn.vo;

public class MainDemo {
	public static void main(String[]args){
		//LiftOff launch=new LiftOff();
		//launch.run();
		
		
		//System.out.println("===============");
		for(int i=0;i<5;i++){
			new Thread(new LiftOff()).start();
			System.out.println("==============");
		}
		System.out.println("this is main()");
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
	} 
}
