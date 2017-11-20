package org.cn.vo;
class One{
	static {
		System.out.println("class One");
	}
}
class Two{
	public Two(){
		
	}
	static{
		System.out.println("class Two");
	}
}
class Three{
	static{
		System.out.println("class Three");
	}
}
public class ClassDemo {
	public static void main(String[] args){
		System.out.println("=========before new One()==========");
		One one=new One();
		System.out.println("=========after new One()===========");

			try {
				Class.forName("org.cn.vo.Two");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("class Not Found");
			}
		
		System.out.println("===============");
		new Three();
		System.out.println("===============");
	}
}
