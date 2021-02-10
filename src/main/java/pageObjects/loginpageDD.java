package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class loginpageDD {
	public WebDriver driver;
	
	By Username=By.id("inputLoginUsername");
	  By Password=By.id("inputLoginPassword");
	  By Fsign=By.xpath("//button[contains(text(),'Sign in')]");
	  By keeplogged=By.cssSelector("div[class='checkbox']");
	 
	  
	public loginpageDD (WebDriver driver) {
		this.driver=driver;
	}	
	
	public WebElement emailid() {
		return  driver.findElement(Username);
	}
	public WebElement password() {
		return driver.findElement(Password);
	}
	
	public WebElement Checkkeeplogged() {
		 return driver.findElement(keeplogged);
	 }
	 public WebElement final_signin() {
		 return driver.findElement(Fsign);
	 }
	 
}
	 
