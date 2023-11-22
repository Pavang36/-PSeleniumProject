package nopcommerceUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	WebDriver driver;

	public Dropdowns(WebDriver driver) {
		this.driver = driver; 
	}
	public void dof() {
		WebElement sortby=driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
		 Select sc=new Select(sortby);
		 sc.selectByIndex(21);
		 
	}
	public void mon() {
		
		
	WebElement sortby=driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
		 Select sc=new Select(sortby);
		 sc.selectByIndex(6);
		 
	}
	public void year() {
		WebElement dob2 =driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));  
		Select year =new Select(dob2);
		year.selectByValue("1999");
             
	}
}
