package org.mldn.cn;

public abstract class IntGenerator {
	private volatile boolean canceled=false;;
	public abstract int next();
	public boolean isCancecled(){
		return canceled;
	}
	public void cancel(){
		canceled=true;
	}
}
