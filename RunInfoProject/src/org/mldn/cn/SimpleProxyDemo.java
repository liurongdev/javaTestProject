package org.mldn.cn;
interface Interface{
	public void doSomeThing();
	public void doSomeThingElse(String args);
}
class RealObject implements Interface{
	public void doSomeThing(){
		System.out.println("RealObject doSomeThing");
	}
	public void doSomeThingElse(String args){
		System.out.println("RealObject doSomeThingElse");
	}
}
class SimpleProxy implements Interface{
	private Interface proxied;
	public SimpleProxy(Interface proxied){
		this.proxied=proxied;
	}
	public void doSomeThing(){
		System.out.println("SimpleProxy");
		proxied.doSomeThing();
	}
	public void doSomeThingElse(String args){
		System.out.println("args:"+args);
		proxied.doSomeThingElse(args);
	}
}
public class SimpleProxyDemo {
	public static void consumer(Interface iface){
		iface.doSomeThing();
		iface.doSomeThingElse("liurong");
	}
	public static void main(String[] args){
		consumer(new RealObject());
		System.out.println("================");
		consumer(new SimpleProxy(new RealObject()));
		
	}
}
