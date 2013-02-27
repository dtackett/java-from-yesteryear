package com.awesome.ioc;

import com.awesome.Grape;
import com.awesome.User;
import com.awesome.improved.GrapeValidator;
import com.awesome.improved.PermissionChecker;
import junit.framework.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

public class IoCGrapeProcessorTest {

    @Test
    public void testWithValidGrapes() {
        User user = new User();
        user.setCanWrangleGrapes(true);
        List objectList = new ArrayList();
        objectList.add(new Grape());

        PermissionChecker permissionChecker = mock(PermissionChecker.class);
        GrapeValidator grapeValidator = mock(GrapeValidator.class);

        when(permissionChecker.canWrangleGrapes(user)).thenReturn(true);
        when(grapeValidator.areReadyToWrangle(objectList)).thenReturn(true);

        IoCGrapeProcessor grapeProcessor = new IoCGrapeProcessor(permissionChecker, grapeValidator);

        List<Grape> grapeList = grapeProcessor.processGrapes(user, objectList);

        for (Grape grape : grapeList) {
            Assert.assertTrue(grape.isWrangled());
        }
    }
}
