package com.example;

import java.util.ArrayList;
import java.util.List;

public class UnsafeWrangling {

    public static void main(String[] args) {
        List grapeList = new ArrayList();

        grapeList.add(new Grape());
        grapeList.add(new Grape());
        grapeList.add(new Grape());
        grapeList.add(new Grape());

        // Pretend there is a lot of other code going on here.

        grapeList.add("Hi there. I'm gonna break your code!");

        for (int i = 0; i < grapeList.size(); i++) {
            Object grape = grapeList.get(i);
            ((Grape)grape).wrangle();
        }

        // Casting is required
        Grape myGrape = (Grape)grapeList.get(2);

        System.out.println("Wranglin` done!");
    }
}