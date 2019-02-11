package helpers;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiters {

    private final static int EXPLICITLY_WAIT = 10;

    public static void waitUntilElementVisible(AndroidDriver driver, MobileElement mobileElement) {
        new WebDriverWait(driver, EXPLICITLY_WAIT).until(ExpectedConditions.visibilityOf(mobileElement));
    }
}
