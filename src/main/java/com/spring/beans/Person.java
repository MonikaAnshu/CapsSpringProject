package com.spring.beans;

public class Person {
	
	private int ids;
	private String nm;
	private int ag;
	
	
	public int getIds() {
		return ids;
	}


	public void setIds(int ids) {
		this.ids = ids;
	}


	public String getNm() {
		return nm;
	}


	public void setNm(String nm) {
		this.nm = nm;
	}


	public int getAg() {
		return ag;
	}


	public void setAg(int ag) {
		this.ag = ag;
	}


	@Override
	public String toString() {
		return "Person [ids=" + ids + ", nm=" + nm + ", ag=" + ag + "]";
	}


	
	
}
