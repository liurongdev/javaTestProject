package org.cn.vo;

import java.util.EnumSet;
import java.util.Random;

public class EnumTestDemo {
	public enum NAME{
		ZHANG{
			void action(){
				System.out.println("l am zhang");
			}
		},
		CHEN{
			void action(){
				System.out.println("l am chen");
			}
		},
		WANG{
			void action(){
				System.out.println("l am wang");
			}
		};
		abstract void action();
	}
	EnumSet<NAME>set=EnumSet.of(NAME.WANG,NAME.CHEN);
	public String toString(){
		return set.toString();
	}
	public void add(NAME name){
		set.add(name);
	}
	public void show(){
		for(NAME name:set){
			name.action();
		}
	}
	public static void main(String[] args){
		EnumTestDemo demo=new EnumTestDemo();
		System.out.println(demo);
		demo.add(NAME.CHEN);
		demo.add(NAME.ZHANG);
		System.out.println(demo);
		demo.show();
		System.out.println("================================");
		Random rand=new Random(23);
		System.out.println(getIntArray()[rand.nextInt(getIntArray().length-1)]);
		System.out.println(" liurong  zhang  ".trim());
	}
	public static int[] getIntArray(){
		int[] a=new int[]{
				1,2,3,43,4
		};
		return a;
	}
}
