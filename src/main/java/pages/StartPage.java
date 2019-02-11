package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static helpers.Helper.horizontalSwipe;

public class StartPage {

    private AndroidDriver driver;

    @AndroidFindBy(id = "com.alibaba.aliexpresshd:id/ll_main")
    private MobileElement mainWindow;

    public StartPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    public LeftMenu goToLeftMenu() {
        horizontalSwipe(driver, 0.01, 0.7, 0.5, 1);

        return new LeftMenu(driver);
    }
}
