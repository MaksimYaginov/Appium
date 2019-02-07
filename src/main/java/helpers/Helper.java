package helpers;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Dimension;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofSeconds;

public class Helper {

    public static String byResourceId(String resourceId) {
        return (String.format("new UiSelector().resourceId(\"%s\")", resourceId));
    }

    public static <T> T horizontalSwipe(AndroidDriver driver, double startPercentage, double endPercentage,
                                           double anchorPercentage, Integer waitAction) {
        Dimension size = driver.manage().window().getSize();

        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * endPercentage);

        return (T) new TouchAction(driver)
                .press(point(startPoint, anchor))
                .waitAction(waitOptions(ofSeconds(waitAction)))
                .moveTo(point(endPoint, anchor))
                .release().perform();
    }
}
