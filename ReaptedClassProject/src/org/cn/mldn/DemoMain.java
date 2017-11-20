package org.cn.mldn;

class UseFul{
	public void f(){}
	public void g(){}
}
class MoreUseFul extends UseFul{
	public void f(){}
	public void g(){}
	public void m(){}
}
public class DemoMain {
	public static void main(String[] args){
		UseFul[] use= new UseFul[]{
				new UseFul(),
				new MoreUseFul()
		};
		for(int i=0;i<use.length;i++){
			use[i].f();
		}
		((MoreUseFul)use[0]).m();
		((MoreUseFul)use[1]).m();
	}
}


 
