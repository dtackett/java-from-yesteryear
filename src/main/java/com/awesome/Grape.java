package com.awesome;

public class Grape {
    private int id;
	private boolean wrangled;

	public Grape(int id, boolean wrangled) {
        this.id = id;
		this.wrangled = wrangled;
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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