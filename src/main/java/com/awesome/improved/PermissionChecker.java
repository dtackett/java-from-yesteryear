package com.awesome.improved;

import com.awesome.User;

public class PermissionChecker {
    public boolean canWrangleGrapes(User user) {
        if (user == null) {
            // Throw unknown user exception
        }

        if (!user.isCanWrangleGrapes()) {
            // Throw insufficient permissions exception
        }

        // Ensure grapes are ready to be processed
        if (user == null) {
            // Throw invalid list exception
        }

        return true;
    }
}
