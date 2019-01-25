package nativeApp;

import base.BaseNativeTest;
import io.appium.java_client.MobileElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AndroidSelectorsTest extends BaseNativeTest {

    @Test
    public void testFindElementsByAccessibilityId () {
        // Look for element by accessibility. In Android this is the "content-desc"
        List<MobileElement> searchParametersElement = (List<MobileElement>) driver.findElementsByAccessibilityId("Content");
        Assert.assertEquals(searchParametersElement.size(), 1);
    }

    @Test
    public void testFindElementsById () {
        // Look for element by ID. In Android this is the "resource-id"
        List<MobileElement> actionBarContainerElements = (List<MobileElement>) driver.findElementsById("android:id/action_bar_container");
        Assert.assertEquals(actionBarContainerElements.size(), 1);
    }

    @Test
    public void testFindElementsByClassName () {
        // Look for elements by the class name. In Android this is the Java Class Name of the view.
        List<MobileElement> linearLayoutElements = (List<MobileElement>) driver.findElementsByClassName("android.widget.FrameLayout");
        Assert.assertTrue(linearLayoutElements.size() > 1);
    };

    @Test
    public void testFindElementsByXPath () {
        // Find elements by XPath
        List<MobileElement> linearLayoutElements = (List<MobileElement>) driver.findElementsByXPath("//*[@class=\"android.widget.FrameLayout\"]");
        Assert.assertTrue(linearLayoutElements.size() > 1);
    };
}