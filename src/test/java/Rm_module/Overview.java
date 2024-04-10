package Rm_module;

import org.testng.annotations.Test;
import org.testng.Assert;
import io.github.ashwith.flutter.FlutterFinder;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Overview {
private static final Logger logger = LogManager.getLogger(Overview.class);
	
	@Test
	public void overviewtest(FlutterFinder finder, AndroidDriver driver) throws FileNotFoundException, IOException, ParseException, InterruptedException, org.json.simple.parser.ParseException {
		String jsonFilePath = "src/test/java/Rm_module/RM_Testdata.json";
		JSONParser parser = new JSONParser();

		Object obj = parser.parse(new FileReader(jsonFilePath));
		JSONObject jsonObject = (JSONObject) obj;
		
		//finder.byValueKey("overview_scroll_key");
		finder.byValueKey("click_week_option").click();
		
		finder.byValueKey("click_day_option").click();
		
		finder.byValueKey("left_arrow").click();
		
		finder.byValueKey("right_arrow").click();
		
		finder.byValueKey("CallbackInfoKey").click();
		
		finder.byValueKey("PipelineInfoKey").click();
		
		finder.byValueKey("visitDoneInfoKey").click();
		
		finder.byValueKey("pipelinePendingInfoKey").click();
		
		finder.byValueKey("pipelineRescheduledInfoKey").click();
		
		finder.byValueKey("bookingsDoneInfoKey").click();
		
		finder.byValueKey("leaderboard_info_key").click();
		
		finder.byValueKey("menuIcon").click();
		
		finder.byValueKey("notificationPageClick").click();
		
		String Title = (String) jsonObject.get("Title");
		finder.byValueKey("enterTitle").sendKeys(Title);
		
		String Message = (String) jsonObject.get("Message");
		finder.byValueKey("NotificationMessage").sendKeys(Message);
		
		Thread.sleep(2000);
		finder.byValueKey("name").click();
		
		finder.byValueKey("MyTeamButton").click();
		
		finder.byValueKey("AllTeamButton").click();
		
		finder.byValueKey("MyTeamButton").click();
		
		finder.byValueKey("Member1579").click();
		
		finder.byValueKey("ApplyButton").click();
		
		finder.byValueKey("send_notifications").click();
		
		finder.byValueKey("back").click();
		
		
		
		
		
		
		
	}
}