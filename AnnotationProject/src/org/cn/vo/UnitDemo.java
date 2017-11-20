package org.cn.vo;

import java.util.Arrays;

import net.mindview.atunit.Test;
import net.mindview.util.OSExecute;

public class UnitDemo {
	public String methodOne(){
		return "this is methodOne";
	}
	public int methodTwo(){
		System.out.println("this is methodTwo");
		return 2;
	}
	@Test boolean methodOneTest(){
		return methodOne().equals("this is methodOne");
	}
	@Test boolean methodTwoTest(){
		return methodTwo()==2;
	}
	@Test private boolean m3(){
		return true;
	}
	@Test boolean failureTest(){
		return false;
	}
	@Test boolean anotherDisppointment(){
		return false;
	}
	public static void main(String[] args) throws Exception{
		//OSExecute.command("java net.mindview.atunit.AtUnit UnitDemo");
		String[] arg=new String[]{
				"liurong","xixi","zhaeng"
		};
		System.out.println(arg+";" +arg.length);
		String[] myArg=new String[arg.length-1];
		System.arraycopy(arg, 1, myArg, 0, myArg.length);
		System.out.println(Arrays.toString(arg)+";;;"+Arrays.toString(myArg));
		arg=myArg;
		System.out.println(Arrays.toString(arg)+";;;"+Arrays.toString(myArg));
	}
}





