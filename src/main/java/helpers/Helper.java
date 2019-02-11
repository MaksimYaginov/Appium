package helpers;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Dimension;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofSeconds;

public class Helper {

    public static void horizontalSwipe(AndroidDriver driver, double startPercentage, double endPercentage,
                                       double anchorPercentage, int waitAction) {
        Dimension size = driver.manage().window().getSize();

        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * endPercentage);

        new TouchAction(driver)
                .press(point(startPoint, anchor))
                .waitAction(waitOptions(ofSeconds(waitAction)))
                .moveTo(point(endPoint, anchor))
                .release().perform();
    }
}
