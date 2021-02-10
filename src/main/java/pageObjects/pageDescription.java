package pageObjects;

import java.awt.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageDescription {
	public WebDriver driver;
	
	//By prod=By.xpath("//img [@alt='3-Pack Travel Wet Wipes 10 Count']");
	By zoom=By.xpath("//div[@class='scale-ico fa-search-plus']");
	By plus =By.xpath("//div[@class='eagle-scale']/div[2]");
	By minus =By.xpath("//div[@class='eagle-scale']/div[1]");
	By zoomclose=By.cssSelector("div[class='eagle-close']");
	By quantity=By.cssSelector("input[name='picquantity']");
	By addtocart=By.xpath("//button[contains(text(),'Add to my cart')]");
	
	
	
	public pageDescription(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	  
	  public WebElement zoombutton() {
		  return driver.findElement(zoom);
	  }
	  public WebElement plusbutton() {
		 return driver.findElement(plus);
	  }
	  public WebElement minusbutton() {
		  return driver.findElement(minus);
	  }
	  public WebElement zoomclose() {
		  return driver.findElement(zoomclose);
	  }
	  public WebElement quantity() {
		  return driver.findElement(quantity);
	  }
	  public WebElement addcart() {
		  return driver.findElement(addtocart);
	  }
}
