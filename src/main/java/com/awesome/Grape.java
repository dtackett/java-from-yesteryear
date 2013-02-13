package com.awesome;

public class Grape {
	private boolean wrangled;

	public Grape() {
		this(false);
	}

	public Grape(boolean wrangled) {
		this.wrangled = wrangled;
	}

	public void wrangle() {
		this.wrangled = true;
	}

	public void unwrangle() {
		this.wrangled = false;
	}

	public boolean isWrangled() {
		return wrangled;
	}
}