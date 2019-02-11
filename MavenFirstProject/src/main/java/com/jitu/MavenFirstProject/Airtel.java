package com.jitu.MavenFirstProject;

public class Airtel {
	private String gtype;
	private long number;

	public String getGtype() {
		return gtype;
	}

	public void setGtype(String gtype) {
		this.gtype = gtype;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public void service() {
		System.out.println(getGtype() + " " + "Airtel service activated "+getNumber());
	}
}
