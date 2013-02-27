package com.awesome.improved;

import com.awesome.Grape;

import java.util.List;

public class GrapeValidator {
    public boolean areReadyToWrangle(List listOfObjects) {
        if (listOfObjects == null) {
            // Throw invalid list exception
        }

        for (Object obj : listOfObjects) {
            if (!(obj instanceof Grape)) {
                // Throw invalid list exception
            }
        }

        List<Grape> grapes = (List<Grape>)listOfObjects;
        for (Grape grape : grapes) {
            if (grape.isWrangled()) {
                // Throw grapes are already wrangled exception
            }
        }

        return true;
    }
}
