package com.example.buildin;

public class Base {
	public String getInfo() {
		return "Everything Ok";
	}

	@Deprecated
	public String getInformation() {
		return getInfo();
	}

}