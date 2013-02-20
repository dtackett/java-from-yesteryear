package com.example;

import java.util.ArrayList;
import java.util.List;

public class SafeWrangling {

    public static void main(String[] args) {
        List<Grape> grapeList = new ArrayList<Grape>();

        grapeList.add(new Grape());
        grapeList.add(new Grape());
        grapeList.add(new Grape());
        grapeList.add(new Grape());

        // Pretend there is a lot of other code going on here.

        // This generates a compiler error!
        // grapeList.add("Hi there. I'm gonna break your code!");

        for (Grape grape : grapeList) {
            grape.wrangle();
        }

        // Casting is free!
        Grape myGrape = grapeList.get(2);

        System.out.println("Wranglin` done!");
    }
}