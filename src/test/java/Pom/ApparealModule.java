package Pom;

import java.time.Duration;
import java.util.List;

import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import nopcommerceUtilities.Staticwaits;

public class ApparealModule {
	WebDriver driver;
  public ApparealModule(WebDriver driver) {
		this.driver = driver; 
	
	}
  
   
  
  By apparel = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']");
  By Shoes = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Shoes']");
  By selectshoe = By.xpath("//h2[@class='product-title']//a[contains(text(),'adidas Consortium Campus 80s Running Shoes')]");
  By addtocart = By.id("add-to-cart-button-25"); 
  By gotocart = By.xpath("//span[@class='cart-label']");
  By continueshopping = By.xpath("//button[normalize-space()='Continue shopping']");
  By apparel1 = By.cssSelector("a[title='Apparel']");
  By clothing = By.cssSelector("h2[class='title'] a[title='Show products in category Clothing']");
  By selectCloth = By.cssSelector("body > div:nth-child(7) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > h2:nth-child(1) > a:nth-child(1)");
  By entertxt = By.cssSelector("#product_attribute_12");
  By AddWishlist = By.cssSelector("#add-to-wishlist-button-29");
  By spanclose = By.cssSelector("span[title='Close']");
  By GotoWishlist = By.xpath("//span[@class='wishlist-label']");
  By AdCart = By.xpath("//input[@name='addtocart']");
  By Adtocart1 = By.cssSelector("button[name='addtocartbutton']");
  By home = By.cssSelector("a[title='Home']");
  
  
 

 public void app() {
WebElement app = driver.findElement(apparel);
Actions action = new Actions(driver);
action.moveToElement(app).perform();
Staticwaits. staticShortWait();
		
		
driver.findElement(Shoes).click();
Staticwaits. staticShortWait();
	
driver.findElement(selectshoe).click();
Staticwaits. staticShortWait();

WebElement size =driver.findElement(By.xpath("//select[@id='product_attribute_9']"));  
Select plzselect =new Select(size);
plzselect.selectByValue("22");



}
public void app1() {

	
driver.findElement(addtocart).click();
driver.findElement(gotocart).click();
Staticwaits. staticShortWait();
driver.findElement(continueshopping).click();
Staticwaits. staticShortWait();
driver.findElement(apparel1).click();
Staticwaits. staticShortWait();
driver.findElement(clothing).click();
Staticwaits. staticShortWait();
driver.findElement(selectCloth).click();
Staticwaits. staticShortWait();
driver.findElement(entertxt).sendKeys("GoodCloth");
Staticwaits. staticShortWait();
driver.findElement(AddWishlist).click();
Staticwaits. staticLongWait();
driver.findElement(spanclose).click();
Staticwaits. staticLongWait();
driver.findElement(GotoWishlist).click();
Staticwaits.staticShortWait();
driver.findElement(AdCart).click();
Staticwaits. staticShortWait();
driver.findElement(Adtocart1).click();
Staticwaits. staticShortWait();
driver.findElement(continueshopping).click();
Staticwaits. staticShortWait();
driver.findElement(home);
Staticwaits. staticShortWait();
}

public void high3() {
	
	
}
}
