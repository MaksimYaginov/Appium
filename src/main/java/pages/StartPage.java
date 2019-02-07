package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.PageFactory;

import static helpers.Waiters.waitUntilElementVisible;

public class StartPage {

    private AndroidDriver driver;

    @AndroidFindBy(uiAutomator = "com.alibaba.aliexpresshd:id/ll_main")
    private MobileElement mainWindow;

    public StartPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

        waitUntilElementVisible(driver, mainWindow);
    }
}
