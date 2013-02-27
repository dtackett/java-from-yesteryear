package com.awesome.improved;

import com.awesome.Grape;
import com.awesome.User;

import java.util.List;

public class ImprovedGrapeProcessor {
    private PermissionChecker permissionChecker = new PermissionChecker();
    private GrapeValidator grapeValidator = new GrapeValidator();

    public List<Grape> processGrapes(User currentUser, List listOfObjects) {
        // Ensure user has permission to process grapes
        permissionChecker.canWrangleGrapes(currentUser);

        // Ensure grapes are ready to be processed
        grapeValidator.areReadyToWrangle(listOfObjects);

        // Process grapes
        List<Grape> grapes = (List<Grape>)listOfObjects;
        for (Grape grape : grapes) {
            grape.wrangle();
        }

        return grapes;
    }
}
