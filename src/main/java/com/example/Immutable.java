package com.example;

public class Immutable {
    public static void main(String[] args) {
        int primative = 5;

        primative = 6;


        Integer refA = 5;
        Integer refB = refA;

        refB = 6;

        System.out.println(refA);

    }
}
