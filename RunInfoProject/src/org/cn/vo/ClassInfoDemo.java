package org.cn.vo;
interface Network{}
interface Food{}
interface Fruit{}

class Toy{
	public Toy(){}
	public Toy(int i){}
}
class MyToy extends Toy implements Network,Food,Fruit{
	public void f(){
		System.out.println("this is MyToy");
	}
	public MyToy(){
		super(1);
	}
}
public class ClassInfoDemo {
	static void printInfo(Class cc){
		System.out.println("class Name:"+cc.getName()+"   is interface :"+cc.isInterface()+
				"  simpleName:"+cc.getSimpleName()+";  Canonical name:"+cc.getCanonicalName());
	}
	public static void main(String[] args){
		Class c=null;
		try{
			c=Class.forName("org.cn.vo.MyToy");
		}catch(ClassNotFoundException e){
			System.out.println("cannot find class");
			System.exit(2);
		}
		printInfo(c);
		for(Class cc:c.getInterfaces()){
			printInfo(cc);
		}
		
		Object o=null;
		Class sub=c.getSuperclass();
		try {
			o=sub.newInstance();
		} catch (InstantiationException e) {
			System.out.println("cannot instantiate");
			System.exit(2);
		}catch(IllegalAccessException e){
			System.out.println("cannot access");
			System.exit(2);
		}
		printInfo(sub);
		
	}
}
