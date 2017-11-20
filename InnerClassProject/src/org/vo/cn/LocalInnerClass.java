package org.vo.cn;

interface Counter{
	int next();
}
public class LocalInnerClass {
	private int count;
	Counter getCounter(final String name){
		class MyCounter implements Counter{
			public MyCounter(){
				System.out.println("this is MyCounter");
			}
			public int next(){
				System.out.print(name);
				return count++;
			}
		}
		return new MyCounter();
	}
	Counter getCounter2(final String name){
		return new Counter(){
			{
				System.out.println("this is new Counter()");
			}
			public int next(){
				System.out.print(name);
				return count++;
			}
		};
	}
	public static void main(String[] args){
		LocalInnerClass local=new LocalInnerClass();
		Counter 
			c1=local.getCounter("liurong"),
			c2=local.getCounter2("xixi");
		for(int i=0;i<4;i++){
			System.out.println(c1.next());
		}
		for(int i=0;i<4;i++){
			System.out.println(c2.next());
		}
	}
}
