package com.shashank;

public class MyBooks {

	private String java;
	private String maths;
	private String science;
	private String georaphy;
	
	
	
	public MyBooks(String java, String maths, String science, String georaphy) {
		super();
		this.java = java;
		this.maths = maths;
		this.science = science;
		this.georaphy = georaphy;
	}
	
	
	
	public String getJava() {
		return java;
	}
	public void setJava(String java) {
		this.java = java;
	}
	public String getMaths() {
		return maths;
	}
	public void setMaths(String maths) {
		this.maths = maths;
	}
	public String getScience() {
		return science;
	}
	public void setScience(String science) {
		this.science = science;
	}
	public String getGeoraphy() {
		return georaphy;
	}
	public void setGeoraphy(String georaphy) {
		this.georaphy = georaphy;
	}



	@Override
	public String toString() {
		return "MyBooks [java=" + java + ", maths=" + maths + ", science=" + science + ", georaphy=" + georaphy + "]";
	}
	
	
	
	
}
