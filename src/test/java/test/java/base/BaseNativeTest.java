package test.java.base;

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

        capabilities.setCapability("app", "9e6704b4-0026-41fb-a630-0043c0dafc68/Ali.apk");
        capabilities.setCapability("deviceName", "Android Device");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("bitbar_apiKey", "xi1gWPoR0SEMCmFjuRXxa1xdrqx5MgEK");

        //capabilities.setCapability("bitbar_username", "www.estet1995@mail.ru");
        //capabilities.setCapability("bitbar_password", "Vfrcbv1995");
        capabilities.setCapability("bitbar_project", "Project 3");
        capabilities.setCapability("bitbar_testrun", "Test Run 1");
        capabilities.setCapability("bitbar_device", "Google Pixel 9.0 -US");
        capabilities.setCapability("bitbar_app", "9e6704b4-0026-41fb-a630-0043c0dafc68/Ali.apk");
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
