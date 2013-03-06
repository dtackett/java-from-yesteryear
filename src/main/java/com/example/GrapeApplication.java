package com.example;

import com.sun.jersey.api.core.PackagesResourceConfig;

public class GrapeApplication extends PackagesResourceConfig {
    public GrapeApplication() {
        super("com.example.resource");
    }
}
