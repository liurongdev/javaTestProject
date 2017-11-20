package org.cn.mldn;

class Shape{
	public void draw(){
		System.out.println("Shape's Draw");
	}
	public void erase(){
		System.out.println("Shape's erase()");
	}
}
class Circle extends Shape{
	public void show(){
		System.out.println("Circle's show()");
	}
	public void draw(){
		System.out.println("Circle's draw()");
	}
}
public class MainDemo {
	public static void main(String[] args){
		Shape shape=new Shape();
		shape.draw();
		shape.erase();
		
		Shape shape2=new Circle();
		shape2.draw();
		shape2.erase();
		
		
	}
}
