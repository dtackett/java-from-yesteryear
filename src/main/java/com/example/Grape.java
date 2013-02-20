package com.example;

/**
 * The premier class on grape wrangling.
 */
public class Grape {
    private boolean wrangled = false;

    public Grape() {
        wrangled = false;
    }

    public Grape(boolean isWrangled) {
        this.wrangled = isWrangled;
    }

    public void wrangle() {
        wrangled = true;
    }

    public void unwrangle() {
        wrangled = false;
    }

    public boolean isWrangled() {
        return wrangled;

    }
}