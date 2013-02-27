package com.awesome.ioc;

import com.awesome.Grape;
import com.awesome.User;
import com.awesome.improved.GrapeValidator;
import com.awesome.improved.PermissionChecker;

import java.util.List;

public class IoCGrapeProcessor {
    private PermissionChecker permissionChecker;
    private GrapeValidator grapeValidator;

    public IoCGrapeProcessor(PermissionChecker permissionChecker, GrapeValidator grapeValidator) {
        this.permissionChecker = permissionChecker;
        this.grapeValidator = grapeValidator;
    }

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
