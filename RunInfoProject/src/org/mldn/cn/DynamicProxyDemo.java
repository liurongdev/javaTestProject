package org.mldn.cn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class DynamicProxy implements InvocationHandler{
	private Object proxied;
	public DynamicProxy(Object proxied){
		this.proxied=proxied;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("***proxy***:"+proxy.getClass()+",method:"+method+",args:"+args);
		if(args!=null)
			for(Object obj:args)
				System.out.println(obj);
		return method.invoke(proxied, args);
	}
}

public class DynamicProxyDemo {
	public static void consumer(Interface iface){
		iface.doSomeThing();
		iface.doSomeThingElse("liurong");
	}
	public static void main(String[] args){
		RealObject object=new RealObject();
		consumer(object);
		System.out.println("================");
		Interface iface=(Interface)Proxy.newProxyInstance(Interface.class.getClassLoader(),
						new Class[]{Interface.class}, 
						new DynamicProxy(object));
		consumer(iface);
	}
}
