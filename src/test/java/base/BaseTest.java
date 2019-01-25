package base;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.*;

public abstract class BaseTest {

    protected AppiumDriverLocalService service;
    protected final String appActivity = ".ApiDemos";
    protected final String appPackage = "io.appium.android.apis";
    protected final String SEARCH_ACTIVITY = ".app.SearchInvoke";
    protected final String ALERT_DIALOG_ACTIVITY = ".app.AlertDialogSamples";
    protected final String appPath = "D:\\ioappium\\src\\test\\resources\\apps\\ApiDemos-debug.apk";

    @BeforeClass( alwaysRun = true)
    public void globalSetup() {
        service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                .withIPAddress("10.13.0.132").usingPort(4725));
        service.start();
    }

    @AfterClass(alwaysRun = true)
    public void globalTearDown() {
        service.stop();
    }
}
