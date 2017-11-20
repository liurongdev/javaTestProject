package org.cn.vo;
import static org.cn.vo.MyEnum.*;
public class EnumDemoTest {
	MyEnum color=MyEnum.RED;
	public void change(){
		switch(color){
		case RED: color=MyEnum.GREEN;
					break;
		case GREEN: color=YELLOW;
					break;
		
		}
	}
	public String toString(){
		return "the traffic night is:"+color;
	}
	public static void main(String[] args){
		EnumDemoTest test=new EnumDemoTest();
		for(int i=0;i<7;i++){
			System.out.println(test);
			test.change();
		}
	}
}
