package Rm_module;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.github.ashwith.flutter.FlutterFinder;
import io.qameta.allure.Step;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Applaunch {
	private AndroidDriver driver;
	private FlutterFinder finder;
	private static final Logger logger = LogManager.getLogger(Applaunch.class);
	
    @BeforeTest
	public void setUp() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Flutter");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "ZD222B2QJG");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
		dc.setCapability(MobileCapabilityType.NO_RESET, false);
		dc.setCapability("fullReset", true);
		dc.setCapability("autoGrantPermissions", "true");
		dc.setCapability(MobileCapabilityType.APP,
				"C:\\Users\\Bloxuser\\AndroidStudioProjects\\RM_APP\\build\\app\\outputs\\flutter-apk\\app-uat-debug.apk");
		dc.setCapability("appPackage", "com.blox.app.rm.uat");
		dc.setCapability("appActivity", "com.blox.app.rm.MainActivity");

		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		finder = new FlutterFinder(driver);
	}
	
    @Step("Test number 1")
	@Test(priority = 1)
    public void testDashboardNavigation() throws Exception {
		try {
			// Your code for launching the app and performing actions
			Dashboard_Navigation mytask = new Dashboard_Navigation();
			mytask.homepagenavigation(finder, driver);
			
			
	
		} catch (Exception e) {
			logger.error("An error occurred in Dashboard_Navigation: " + e.getMessage(), e);
			throw e;
		}

	}

    @Step("Test number 2")
	@Test(priority = 2)
    public void testoverview() throws Exception {
		try {
			// Your code for launching the app and performing actions
			Overview overview = new Overview();
			overview.overviewtest(finder, driver);
		} catch (Exception e) {
			logger.error("An error occurred in Overview: " + e.getMessage(), e);
			throw e;
		}

	}
    @AfterTest
	public void tearDown() {
		if (driver != null) {
			driver.quit();


	

			// Add a @AfterMethod method here if you need to perform cleanup after the test.
		
	}
    }
}

