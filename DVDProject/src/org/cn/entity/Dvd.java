package org.cn.entity;

public class Dvd {
	private int id;
	private String dname;
	private String dcount;
	private int status;
	@Override
	public String toString() {
		return "Dvd [id=" + id + ", dname=" + dname + ", dcount=" + dcount + ", status=" + status + "]";
	}
	public Dvd(int id, String dname, String dcount, int status) {
		super();
		this.id = id;
		this.dname = dname;
		this.dcount = dcount;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDcount() {
		return dcount;
	}
	public void setDcount(String dcount) {
		this.dcount = dcount;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
