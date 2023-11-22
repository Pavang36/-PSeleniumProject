package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

import junit.framework.Assert;
import nopcommerceUtilities.Staticwaits;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		 this.driver=driver;
	}
	
//locators
	
	By login = By.xpath("//a[normalize-space()='Log in']");
	By Email = By.xpath("//input[@id='Email']");
	By password = By.xpath("//input[@id='Password']");
	By loginbutton = By.xpath("//button[normalize-space()='Log in']");
	
	
//methods	

public void  login() {
driver.findElement(login).click();
Staticwaits.staticShortWait();

}
public void loginEmail(String Lmail){
driver.findElement(Email).sendKeys(Constants.Lmail);
Staticwaits.staticShortWait();
	
}
public void loginP(String lpassword) {
driver.findElement(password).sendKeys(Constants.Lpassword);
Staticwaits.staticShortWait();

}

public void log() {
driver.findElement(loginbutton).click();
Staticwaits.staticShortWait();


}

}
