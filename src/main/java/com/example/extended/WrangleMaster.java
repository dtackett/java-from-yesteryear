package com.example.extended;

import com.example.Grape;

import java.util.ArrayList;
import java.util.List;

public class WrangleMaster {
    public static void main(String[] args) {
        List<Grape> grapeList = new ArrayList<Grape>();

        grapeList.add(new Grape());
        grapeList.add(new FancyGrape());

        // This will fail to compile! but otherwise works.
        // FancyGrape myFancyGrape = grapeList.get(1);
    }
}
