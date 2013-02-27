package com.awesome.improved;

import com.awesome.Grape;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class GrapeValidatorTest {
    private GrapeValidator grapeValidator;

    @Before
    public void setup() {
        grapeValidator = new GrapeValidator();
    }

    @Test
    public void testWithGrapelessList() {
        List objectList = new List();
        objectList.add(new Object());

        grapeValidator.areReadyToWrangle(objectList);

        // Assert invalid list exception thrown
    }

    @Test
    public void testWithMixedList() {
        List objectList = new List();
        objectList.add(new Grape());
        objectList.add(new Object());

        grapeValidator.areReadyToWrangle(objectList);

        // Assert invalid list exception thrown
    }
}
