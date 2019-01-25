package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

public class BaseNativeTest extends BaseTest {
    private DesiredCapabilities capabilities = new DesiredCapabilities();
    protected AndroidDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 4 API 24");
        capabilities.setCapability("app", appPath);
        capabilities.setCapability("appPackage", appPackage);
        capabilities.setCapability("appActivity", appPackage + appActivity);
    }

    @BeforeMethod(alwaysRun = true)
    public void createDriver() {
        driver = new AndroidDriver(service.getUrl(), capabilities);
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        driver.quit();
    }
}
