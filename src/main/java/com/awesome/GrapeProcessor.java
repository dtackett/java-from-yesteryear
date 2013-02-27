package com.awesome;

import java.util.List;

public class GrapeProcessor {
    public List<Grape> processGrapes(User currentUser, List listOfObjects) {
        // Ensure user has permission to process grapes
        if (currentUser == null) {
            // Throw unknown user exception
        }

        if (!currentUser.isCanWrangleGrapes()) {
            // Throw insufficient permissions exception
        }

        // Ensure grapes are ready to be processed
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

        // Process grapes
        for (Grape grape : grapes) {
            grape.wrangle();
        }

        return grapes;
    }
}
