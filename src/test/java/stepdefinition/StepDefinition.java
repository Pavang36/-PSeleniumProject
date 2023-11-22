package stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom.ApparealModule;
import Pom.LoginPage;
import Pom.RegistrationPage;
import RecordingTests.ScreenRecorderUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import nopcommerceUtilities.Dropdowns;
import nopcommerceUtilities.Screenshots;
import nopcommerceUtilities.Staticwaits;

public class StepDefinition {
	 public WebDriver driver;

	@Given("open the browser")
	public void open_the_browser() throws Exception {

		
		ScreenRecorderUtil.startRecord("open_the_browser");

	 WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
	}
  @When("user enter the url {string}")
	public void user_enter_the_url(String string) throws IOException{
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Screenshots.capture(driver);
		System.out.println("Hii");
	}


	@Then("click on the Register")
	public void click_on_the_register() throws IOException{
	RegistrationPage rp=new RegistrationPage(driver);
	    rp.Register();
		Screenshots.capture(driver);
	}


	@When("click on the Gender")
	public void click_on_the_gender() throws IOException{
		RegistrationPage rp=new RegistrationPage(driver);
		 rp.gender();
		 Screenshots.capture(driver);
		
	}

	@Then("Enter a Firstname  {string}")
	public void enter_a_firstname(String string) throws Exception{

		RegistrationPage rp=new RegistrationPage(driver);
		 rp.firstname(string);
		 Screenshots.capture(driver);
	}

	@When("enter a Lastname {string}")
	public void enter_a_lastname(String string) throws IOException{
		RegistrationPage rp=new RegistrationPage(driver);
		 rp.lastname(string);
		 Screenshots.capture(driver);

	}
	@Then("enter a dob {string}")
	public void enter_a_dob(String string) throws IOException{
		Dropdowns e = new Dropdowns(driver);
		e.dof();
		Staticwaits. staticShortWait();
		e.mon();
		Staticwaits. staticShortWait();
		e.year();
		 Screenshots.capture(driver);
		 Staticwaits. staticShortWait();
	}

	@Then("Enter a Email {string}")
	public void enter_a_email(String string) throws IOException{
		RegistrationPage rp=new RegistrationPage(driver);
		 rp.mail(string);
		 rp.cname(string);
		 Screenshots.capture(driver);
	}

	@When("enter the Password\"<password>\"")
	public void enter_the_password_password1() throws IOException{
		RegistrationPage rp=new RegistrationPage(driver);
		 rp.password(null);
		 Screenshots.capture(driver);
	}

	@Then("Enter a  ConfirmPassword {string}")
	public void enter_a_confirm_password(String string) throws IOException{
		RegistrationPage rp=new RegistrationPage(driver);
		 rp.confirmpassword(null);
		 Screenshots.capture(driver);
		 
	}

	@When("click on a Register button")
	public void click_on_a_register_button() throws IOException{
		RegistrationPage rp=new RegistrationPage(driver);
		 rp.Registerbutton();
		 Screenshots.capture(driver);
		// rp.loginTest();
	}

	@Then("click on the Login")
	public void click_on_the_login() throws IOException{
		
	LoginPage rp=new LoginPage(driver);
	rp.login();
	Staticwaits. staticShortWait();
	Staticwaits. staticShortWait();
	}

	@When("enter the email\"<email>\"")
	public void enter_the_email_email() throws IOException{
	LoginPage rp=new LoginPage(driver);
	rp.loginEmail(null);
	Screenshots.capture(driver);
	Staticwaits. staticShortWait();

	}

	@When("enter the password\"<password>\"")
	public void enter_the_password_password() throws IOException{ 
	LoginPage rp=new LoginPage(driver);
	rp.loginP(null);
	Screenshots.capture(driver);
	Staticwaits. staticShortWait();
	}

	@Then("click on the login button")
	public void click_on_the_login_button() throws Exception{
	LoginPage rp=new LoginPage(driver);
	rp.log();
	Screenshots.capture(driver);
	Staticwaits. staticShortWait();
	}
	    
	@When("click apparelmodule")
	public void click_apparelmodule() throws IOException {

	ApparealModule r = new ApparealModule(driver);
	r.app();
	Staticwaits. staticShortWait();
	Screenshots.capture(driver);
	}
	@When("click on addtocart")
	public void click_on_addtocart() throws Exception {

		ApparealModule r = new ApparealModule(driver);
	r.app1();
	Staticwaits. staticShortWait();
	ScreenRecorderUtil.stopRecord();
	Screenshots.capture(driver);
	driver.quit();
	}

}
