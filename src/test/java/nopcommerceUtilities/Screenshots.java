package nopcommerceUtilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Allure;

public class Screenshots {
	static WebDriver driver; 
	
	 public Screenshots(WebDriver driver) {
		this.driver=driver;
	}

	 public static void capture(WebDriver driver) throws IOException {
		 File screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  Allure.addAttachment("Screenshot", FileUtils.openInputStream(screenshotAs));

}
	 
}
