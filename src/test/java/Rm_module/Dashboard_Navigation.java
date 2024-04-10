package Rm_module;

import org.testng.annotations.Test;
import org.testng.Assert;
import io.github.ashwith.flutter.FlutterFinder;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Dashboard_Navigation {
	private static final Logger logger = LogManager.getLogger(Dashboard_Navigation.class);

	public void homepagenavigation(FlutterFinder finder, AndroidDriver driver) throws FileNotFoundException,
			IOException, ParseException, InterruptedException, org.json.simple.parser.ParseException {
		String jsonFilePath = "src/test/java/Rm_module/RM_Testdata.json";
		JSONParser parser = new JSONParser();

		Object obj = parser.parse(new FileReader(jsonFilePath));
		JSONObject jsonObject = (JSONObject) obj;

		String mobilenumber = (String) jsonObject.get("mobileNumber");
		WebElement mobileformfield = finder.byValueKey("MobileFormfield");

		mobileformfield.sendKeys(mobilenumber);
		finder.byValueKey("sendOTPButton").click();
		finder.byValueKey("otpInputField");
		String otp = (String) jsonObject.get("OTP");
		finder.byValueKey("otpInputField").sendKeys(otp);
		finder.byValueKey("submitOTPButton").click();
		
		

		Assert.assertNotNull(finder.byValueKey("homeIconClick"));
		logger.info("User is on Dashboard page");
		

		logger.info("Dashboard page Today fliter checked");
		

		finder.byValueKey("dashboardTodayClick").click();
		Assert.assertNotNull(finder.byValueKey("homeIconClick"));
		logger.info("Dashboard page Today fliter checked");

		finder.byValueKey("dashboardTomorrowClick").click();
		Assert.assertNotNull(finder.byValueKey("homeIconClick"));
		logger.info("Dashboard page Tomorrow fliter checked");

		finder.byValueKey("dashboardWeekClick").click();
		Assert.assertNotNull(finder.byValueKey("homeIconClick"));
		logger.info("Dashboard page Week fliter checked");

		finder.byValueKey("dashboardAllClick").click();
		Assert.assertNotNull(finder.byValueKey("homeIconClick"));
		logger.info("Dashboard page All fliter checked");
		

		logger.info("My meeting visit type checked");
		finder.byValueKey("Virtual").click();
		
		finder.byValueKey("Physical").click();
		
		finder.byValueKey("Telemeeting").click();
		
		finder.byValueKey("Webinar").click();
		
		finder.byValueKey("dashboardMeetingViewAllClick").click();
		
		finder.byValueKey("homeIconClick").click();
		
		finder.byValueKey("dashboardTaskViewAllClick").click();
		
		finder.byValueKey("homeIconClick").click();
		
		finder.byValueKey("dashboardTaskViewAllClick").click();
		

		logger.info("Now checking the hamburger menu links");
		finder.byValueKey("menuIcon").click();
		finder.byValueKey("dashboardPageClick").click();
		Assert.assertNotNull(finder.byValueKey("homeIconClick"));
		logger.info("Dashborad page");

		finder.byValueKey("menuIcon").click();
		finder.byValueKey("MyMeetingPageClick").click();
		logger.info("My meeting page checked ");
		finder.byValueKey("homeIconClick").click();

		finder.byValueKey("menuIcon").click();
		finder.byValueKey("myFollowUpsPageClick").click();
		System.out.println("My Followup page checked");
		finder.byValueKey("homeIconClick").click();

		finder.byValueKey("menuIcon").click();
		finder.byValueKey("myPortfolioPageClick").click();
		logger.info("My meeting page checked");
		finder.byValueKey("back").click();

//		finder.byValueKey("findFreshLeadsPageClick").click();
//		logger.info("My Find Fresh page checked");
//		finder.byValueKey("back").click();

//		finder.byValueKey("menuIcon").click();
//		finder.byValueKey("coldCallingCustomerPageClick").click();
//		logger.info("My Find Fresh page checked");
//		finder.byValueKey("back").click();
//		
//
		finder.byValueKey("menuIcon").click();
		finder.byValueKey("searchCustomerPageClick").click();
		logger.info("My Search customer page checked");
		finder.byValueKey("back").click();

		finder.byValueKey("menuIcon").click();
		finder.byValueKey("addNewLeadPageClick").click();
		logger.info("Add new lead page checked");
		finder.byValueKey("homeIconClick").click();
		Thread.sleep(2000);
		logger.info("Now checking the Dashboard bottom navigation");

		finder.byValueKey("MyFollowUpIconClick").click();
		logger.info("My Followup page checked");
		finder.byValueKey("homeIconClick").click();

		finder.byValueKey("MyMeetingClick").click();
		logger.info("My meeting page checked");
		finder.byValueKey("homeIconClick").click();

		finder.byValueKey("addNewLeadClick").click();
		logger.info("Add new lead page checked");
		finder.byValueKey("homeIconClick").click();
		logger.info("Now checking the Dashboard Top navigation");

		Thread.sleep(2000);

		finder.byValueKey("homeSearchIconClick").click();
		logger.info("Search icon page checked");
		finder.byValueKey("back").click();

		finder.byValueKey("homeNotificationIconClick").click();
		logger.info("Notification icon page checked");
		finder.byValueKey("back").click();

		finder.byValueKey("homeProfileIconClick").click();
		logger.info("Profile icon page checked");
		finder.byValueKey("back").click();
		
		finder.byValueKey("menuIcon").click();
		finder.byValueKey("overViewPageClick").click();
//
//		finder.byValueKey("menuIcon").click();
//		finder.byValueKey("logOutPageClick").click();

	}
}
