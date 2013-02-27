package com.awesome.improved;

import com.awesome.Grape;
import com.awesome.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ImprovedGrapeProcessorTest {

    @Test
    public void testWithValidGrapes() {
        User user = new User();
        user.setCanWrangleGrapes(true);
        List objectList = new ArrayList();
        objectList.add(new Grape());

        List<Grape> grapeList = new ImprovedGrapeProcessor().processGrapes(user, objectList);

        for (Grape grape : grapeList) {
            Assert.assertTrue(grape.isWrangled());
        }
    }
}
