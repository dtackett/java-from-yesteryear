package com.example.buildin;

public class Extended extends Base {
	@Override
	public String getInfo() {
		return "Everything slightly better!";
	}

	public String oldAccess() {
		return getInformation();
	}

	@SuppressWarnings("deprecation")
	public String safeAccess() {
		return getInformation();
	}

	/*
	@Override
	public String getInfo(String param) {
		return param;
	}
	*/
}