package com.awesome.improved;

import com.awesome.User;
import org.junit.Before;
import org.junit.Test;

public class PermissionCheckerTest {
    private PermissionChecker permissionChecker;

    @Before
    public void setup() {
        permissionChecker = new PermissionChecker();
    }

    @Test
    public void testNullUser() {
        User user = null;

        permissionChecker.canWrangleGrapes(user);

        // Assert that unknown user exception thrown
    }

    @Test
    public void testUserBadPermissions() {
        User user = new User();
        user.setCanWrangleGrapes(false);

        permissionChecker.canWrangleGrapes(user);

        // Assert that insufficient permissions exception thrown
    }

    @Test
    public void testValidUser() {
        User user = new User();
        user.setCanWrangleGrapes(true);

        permissionChecker.canWrangleGrapes(user);
    }
}
