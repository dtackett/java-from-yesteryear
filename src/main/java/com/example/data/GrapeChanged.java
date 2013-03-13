package com.example.data;

import org.codehaus.jackson.annotate.JsonProperty;

public class GrapeChanged {
    @JsonProperty(value="wrangled")
    private Boolean wrungled = false;

    public Boolean getWrungled() {
        return wrungled;
    }

    public void setWrungled(Boolean wrungled) {
        this.wrungled = wrungled;
    }

    public String toString() {
      return "Wrungled: " + wrungled;
    }
}
