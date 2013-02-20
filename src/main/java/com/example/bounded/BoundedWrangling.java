package com.example.bounded;

import com.example.Grape;
import com.example.extended.FancyGrape;

import java.util.ArrayList;
import java.util.List;

public class BoundedWrangling {
    public static void main(String[] args) {
        List<Grape> grapeList = new ArrayList<Grape>();
        grapeList.add(new Grape());

        Grape myGrape = getFirst(grapeList);


        List<FancyGrape> fancyGrapeList = new ArrayList<FancyGrape>();
        fancyGrapeList.add(new FancyGrape());

        FancyGrape myFancyGrape = getFirst(fancyGrapeList);

        MutantGrapeRock mutantGrapeRock = new MutantGrapeRock();
        doThing(mutantGrapeRock);
    }

    private static <E extends Grape> E getFirst(List<E> grapeList) {
        return grapeList.get(0);
    }

    private static <F extends Grape & Animal & Mineral> F doThing(F target) {
        target.wrangle();
        target.poke();
        target.mine();
    }
}
