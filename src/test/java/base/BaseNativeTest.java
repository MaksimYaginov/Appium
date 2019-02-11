package base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseNativeTest {

    private DesiredCapabilities capabilities = new DesiredCapabilities();
    protected AndroidDriver driver;

    @BeforeSuite(alwaysRun = true)
    public void setUp() {
        capabilities.setCapability("deviceName", "Google Pixel 9.0 -US");
        capabilities.setCapability("platform", "Android");
        capabilities.setCapability("forceMjsonwp", "True");
        capabilities.setCapability("bitbar_project", "Appium Cloud");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("bitbar_target", "Android");
        capabilities.setCapability("bitbar_testrun", "Test Run");
        capabilities.setCapability("bitbar_device", "Google Pixel 9.0 -US");
        capabilities.setCapability("bitbar_app", "8698f60b-720b-47bf-bc70-036e7a9b8f6e/Ali.apk");
        capabilities.setCapability("bitbar_apiKey", "xi1gWPoR0SEMCmFjuRXxa1xdrqx5MgEK");
    }

    @BeforeMethod(alwaysRun = true)
    public void createDriver() throws MalformedURLException {
        driver = new AndroidDriver(new URL("https://appium.bitbar.com/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        driver.quit();
    }
}
