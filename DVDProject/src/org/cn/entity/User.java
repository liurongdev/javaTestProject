package org.cn.entity;

public class User {
	private int id;
	private String uname;
	private String upass;
	private int type;
	public User(int id,String uname,String upass,int type){
		super();
		this.id=id;
		this.uname=uname;
		this.upass=upass;
		this.type=type;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getUname(){
		return this.uname;
	}
	public void setUname(String uname){
		this.uname=uname;
	}
	public String getUpass(){
		return this.upass;
	}
	public void setUpass(String upass){
		this.upass=upass;
	}
	public int getType(){
		return this.type;
	}
	public void setType(int type){
		this.type=type;
	}
	public String toString(){
		return "id:"+id+" uname:"+uname+" upass:"+upass+" type:"+type;
	}
}
