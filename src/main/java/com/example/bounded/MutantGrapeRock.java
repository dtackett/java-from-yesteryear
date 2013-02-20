package com.example.bounded;

import com.example.Grape;

public class MutantGrapeRock extends Grape implements Animal, Mineral {
    @Override
    public void poke() {
        System.out.println("Mutant Grape grumbles at you.");
    }

    @Override
    public void mine() {
        System.out.println("Mutant Grape looks displeased");
    }
}
