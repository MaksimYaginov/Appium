package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.PageFactory;

import static helpers.Helper.byResourceId;
import static helpers.Waiters.waitUntilElementVisible;

public class LeftMenu {

    private AndroidDriver driver;

    @AndroidFindBy(uiAutomator = "com.alibaba.aliexpresshd:id/navdrawer")
    private MobileElement leftMenu;

    public LeftMenu(AndroidDriver driver, MobileElement leftMenu) {
        this.driver = driver;;
        PageFactory.initElements(driver, this);

        waitUntilElementVisible(driver, this.leftMenu);
    }

    public boolean leftMenuIsVisible(){
        return leftMenu.isDisplayed();
    }
}
