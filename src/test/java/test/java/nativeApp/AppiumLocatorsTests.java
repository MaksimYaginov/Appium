package test.java.nativeApp;

import static helpers.Helper.horizontalSwipe;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LeftMenu;
import pages.StartPage;
import test.java.base.BaseNativeTest;


public class AppiumLocatorsTests extends BaseNativeTest {

    private StartPage startPage;
    private LeftMenu leftMenu;

    @Test
    public void testSwipe() {
        startPage = new StartPage(driver);

        leftMenu = horizontalSwipe(driver, 0.01, 0.7, 0.5, 1);

        Assert.assertTrue(leftMenu.leftMenuIsVisible(), "Menu not opened");

        startPage = horizontalSwipe(driver, 0.7, 0.01, 0.5, 1);

        Assert.assertTrue(!leftMenu.leftMenuIsVisible(), "Menu not closed");
    }
}