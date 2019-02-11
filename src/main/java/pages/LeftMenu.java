package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.NoSuchElementException;

import static helpers.Helper.horizontalSwipe;
import static helpers.Waiters.waitUntilElementVisible;

public class LeftMenu {

    private AndroidDriver driver;

    @AndroidFindBy(id = "com.alibaba.aliexpresshd:id/navdrawer")
    private AndroidElement leftMenu;

    LeftMenu(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);

        waitUntilElementVisible(driver, leftMenu);
    }

    public boolean leftMenuIsVisible() {
        try {
            return leftMenu.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void closeLeftMenu() {
        horizontalSwipe(driver, 0.7, 0.01, 0.5, 0);
    }
}
