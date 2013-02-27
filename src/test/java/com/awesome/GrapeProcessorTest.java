package com.awesome;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GrapeProcessorTest {
    private GrapeProcessor grapeProcessor;

    @Before
    public void setup() {
        grapeProcessor = new GrapeProcessor();
    }

    @Test
    public void testNullUser() {
        User user = null;
        List objectList = null;

        grapeProcessor.processGrapes(user, objectList);

        // Assert that unknown user exception thrown
    }

    @Test
    public void testUserBadPermissions() {
        User user = new User();
        user.setCanWrangleGrapes(false);
        List objectList = null;

        grapeProcessor.processGrapes(user, objectList);

        // Assert that insufficient permissions exception thrown
    }

    @Test
    public void testWithNullList() {
        User user = new User();
        user.setCanWrangleGrapes(true);
        List objectList = null;

        grapeProcessor.processGrapes(user, objectList);

        // Assert invalid list exception thrown
    }

    @Test
    public void testWithGrapelessList() {
        User user = new User();
        user.setCanWrangleGrapes(true);
        List objectList = new ArrayList();
        objectList.add(new Object());

        grapeProcessor.processGrapes(user, objectList);

        // Assert invalid list exception thrown
    }

    @Test
    public void testWithMixedList() {
        User user = new User();
        user.setCanWrangleGrapes(true);
        List objectList = new ArrayList();
        objectList.add(new Grape());
        objectList.add(new Object());

        grapeProcessor.processGrapes(user, objectList);

        // Assert invalid list exception thrown
    }

    // And so on and so forth ...

    @Test
    public void testWithValidGrapes() {
        User user = new User();
        user.setCanWrangleGrapes(true);
        List objectList = new ArrayList();
        objectList.add(new Grape());

        List<Grape> grapeList = grapeProcessor.processGrapes(user, objectList);

        for (Grape grape : grapeList) {
            Assert.assertTrue(grape.isWrangled());
        }
    }
}
