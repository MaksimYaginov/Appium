package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseWebTest extends BaseTest {
    private DesiredCapabilities capabilities = new DesiredCapabilities();
    protected AndroidDriver webAndroidDriver;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 4 API 24");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
    }

    @BeforeMethod(alwaysRun = true)
    public void createDriver() {
        webAndroidDriver = new AndroidDriver(service.getUrl(), capabilities);
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        webAndroidDriver.quit();
    }
}
