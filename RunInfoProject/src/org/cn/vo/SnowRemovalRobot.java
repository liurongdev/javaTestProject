package org.cn.vo;

import java.util.Arrays;
import java.util.List;

public class SnowRemovalRobot implements Robot{
	private String name;
	public SnowRemovalRobot(String name){
		this.name=name;
	}
	public String name(){
		return name;
	}
	public String model(){
		return "SnowBot Series 11";
	}	
	public List<Operation> operations(){
		return Arrays.asList(
				new Operation(){
					public String description(){
						return name+"can eat";
					}
					public void command(){
						System.out.println(name+" is eating");
					}
				},
				new Operation(){
					public String description(){
						return name+"can work";
					}
					public void command(){
						System.out.println(name+" is working");
					}
				},
				new Operation(){
					public String description(){
						return name+" can run";
					}
					public void command(){
						System.out.println(name+" is running");
					}
				});
	}
	public static void main(String[] args){
		Robot.Test.test(new SnowRemovalRobot("liurong"));
	}
}
