package com.example.data;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// @JsonIgnoreProperties(ignoreUnknown = true)
public class Grape {
    private Boolean wrangled = false;

    public Boolean getWrangled() {
        return wrangled;
    }

    public void setWrangled(Boolean wrangled) {
        this.wrangled = wrangled;
    }

    public String toString() {
      return "Wrangled: " + wrangled;
    }
}
