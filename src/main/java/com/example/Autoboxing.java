package com.example;

public class Autoboxing {
    public static void main(String[] args) {
        overload(1);
        overload(new Integer(1));

        autobox(1.0f);
        autobox(new Float(1.0f));

        autolong(1L);
        autolong(new Long(1L));
    }

    public static void overload(Integer value) {
        System.out.println("Integer object " + value);
    }

    public static void overload(int value) {
        System.out.println("Integer primitive " + value);
    }

    public static void autobox(float value) {
        System.out.println("Autobox " + value);
    }

    public static void autolong(Long value) {
        System.out.println("Autolong " + value);
    }
}