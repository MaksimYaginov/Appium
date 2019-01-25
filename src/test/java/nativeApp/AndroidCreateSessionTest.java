package nativeApp;

import base.BaseNativeTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AndroidCreateSessionTest extends BaseNativeTest {

    @Test
    public void testCreateSession() {
        String realAppActivity = driver.currentActivity();
        String realAppPackage = driver.getCurrentPackage();
        Assert.assertEquals(realAppActivity, appActivity);
        Assert.assertEquals(realAppPackage, appPackage);
    }
}