package nativeApp;

import base.BaseNativeTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LeftMenu;
import pages.StartPage;

public class SwipeTest extends BaseNativeTest {

    private StartPage startPage;
    private LeftMenu leftMenu;

    @Test
    public void testSwipe() {
        startPage = new StartPage(driver);

        leftMenu = startPage.goToLeftMenu();

        Assert.assertTrue(leftMenu.leftMenuIsVisible(), "Menu not opened");

        leftMenu.closeLeftMenu();

        Assert.assertTrue(!leftMenu.leftMenuIsVisible(), "Menu not closed");
    }
}