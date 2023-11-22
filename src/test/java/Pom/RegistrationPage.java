package Pom;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

import nopcommerceUtilities.ReadData;
import nopcommerceUtilities.Staticwaits;

public class RegistrationPage {

	public WebDriver driver;
	ReadData read = new ReadData();
	

	//locators
	By registerpage = By.xpath("//a[normalize-space()='Register']");
	By female = By.xpath("//input[@id='gender-male']");
	By firstname =  By.xpath("//input[@id='FirstName']");
	By lastname =  By.xpath("//input[@id='LastName']");
	By Email =  By.xpath("//input[@id='Email']");
	By companyname  = By.xpath("//input[@id='Company']");
	By password = By.xpath("//input[@id='Password']");
	By cnfpassword = By.xpath("//input[@id='ConfirmPassword']");
	By rgbutton = (By.xpath("//button[@id='register-button']"));
	By slogin = By.xpath("//a[normalize-space()='Log in']");
	

	
	//constructor



	public RegistrationPage(WebDriver driver) {
		this.driver=driver;
	}

	//methods
	public void Register(){
	driver.findElement(registerpage).click();	
	Assert.assertTrue(driver.findElement(registerpage).isEnabled());
	System.out.println(driver.findElement(registerpage).isEnabled());
	Staticwaits. staticShortWait();
	}
	
		
	public   void gender(){
	driver.findElement(female).click();	
	Staticwaits. staticShortWait();
	}
	public   void firstname(String fsname) throws Exception{
	driver.findElement(firstname).sendKeys(read.getFirstname());
    Assert.assertNotNull(driver.findElement(firstname).isDisplayed()); 	
    System.out.println(driver.findElement(firstname).isDisplayed());
	Staticwaits. staticShortWait();
	}
	public   void lastname(String lsname) throws IOException{
	driver.findElement(lastname).sendKeys(read.getlastname());
	Assert.assertNotNull(driver.findElement(lastname).isDisplayed()); 	
	System.out.println(driver.findElement(lastname).isDisplayed());
	Staticwaits. staticShortWait();
	}
	

	public   void mail(String email) throws IOException{
	driver.findElement(Email).sendKeys(read.getemail());
	Assert.assertNotNull(driver.findElement(Email).isDisplayed()); 	
    System.out.println(driver.findElement(Email).isDisplayed());
	Staticwaits. staticShortWait();
	}
	public   void cname(String nameee) throws IOException {
    driver.findElement(companyname).sendKeys(read.getCompantname());
	Assert.assertNotNull(driver.findElement(companyname).isDisplayed()); 	
    System.out.println(driver.findElement(companyname).isDisplayed());
	Staticwaits. staticShortWait();
	}
	public   void password(String pwd) throws IOException{
	driver.findElement(password).sendKeys(read.getpwd());
	Assert.assertNotNull(driver.findElement(password).isDisplayed()); 	
	 System.out.println(driver.findElement(password).isDisplayed());
	Staticwaits. staticShortWait();
	}
	public   void confirmpassword(String confpwd) throws IOException{
	driver.findElement(cnfpassword).sendKeys(read.getconfpwd());
	Assert.assertNotNull(driver.findElement(cnfpassword).isDisplayed()); 	
	System.out.println(driver.findElement(cnfpassword).isDisplayed());
	Staticwaits. staticShortWait();
    }
	public   void Registerbutton(){
	driver.findElement(rgbutton).click();	
	Assert.assertTrue(driver.findElement(rgbutton).isEnabled());
	System.out.println(driver.findElement(registerpage).isEnabled());
	WebElement continuebtn = driver.findElement(By.className("buttons"));
	WebElement success_message = driver.findElement(RelativeLocator.with(By.tagName("div")).above(continuebtn));
//WebElement success_message = driver.findElement(By.cssSelector(".result"));
	String success_message_text = success_message.getText();
	
	if(success_message_text == "Your registration completed") {
		System.out.println("Your registration completed");
		driver.findElement(slogin).click();
	}else {
		System.out.println("The Specified Email Already Exists");
	}
	Staticwaits. staticShortWait();
	}
}

