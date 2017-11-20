package org.cn.vo;

public class SimpleThread extends Thread{
	private static int ThreadCount=0;
	private int countDown=5;
	public SimpleThread(){
		super(Integer.toString(++ThreadCount));
		start();
	}
	public String toString(){
		return "#"+getName()+"("+countDown+"),";
	}
	public void run(){
		while(true){
			System.out.print(this);
			if(--countDown==0){
				return;
			}
		}
	}
	public static void main(String[] args){
		for(int i=0;i<5;i++){
			new SimpleThread();
		}
	}
}
