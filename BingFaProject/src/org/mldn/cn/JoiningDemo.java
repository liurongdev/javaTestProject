package org.mldn.cn;

class Sleeper extends Thread{
	private int duration;
	public Sleeper(String name,int duration){
		super(name);
		this.duration=duration;
		start();
	}
	public void run(){
		try{
			sleep(duration);
		}catch(InterruptedException e){
			System.out.println(getName()+" interruptedException,"+" isInterrupted:"+isInterrupted());
			return;
		}
		System.out.println(getName()+" has awakened");
	}
}
class Joiner extends Thread{
	private Sleeper sleeper;
	public Joiner(String name,Sleeper sleeper){
		super(name);
		this.sleeper=sleeper;
		start();
	}
	public void run(){
		try{
			sleeper.join();
		}catch(InterruptedException e){
			System.out.println("Interrupted");
		}
		System.out.println(getName()+" join completed");
	}
}
public class JoiningDemo {
	public static void main(String[] args){
		Sleeper
			sleepy=new Sleeper("sleepy",1500),
			grumpy=new Sleeper("grumpy",1500);
		Joiner
			dopey=new Joiner("dopey",sleepy),
			doc=new Joiner("Doc",grumpy);
		grumpy.interrupt();
	}
}
