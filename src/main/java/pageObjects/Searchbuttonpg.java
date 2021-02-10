package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Searchbuttonpg {
	public WebDriver driver;
	
	By Search= By.xpath("//input[@class='form-control dd-search ui-autocomplete-input rfk_sb']");
	By Enter= By.xpath("//button[@class='btn btn-primary btn-search dd-search']");
	By prodname=By.xpath("//div[@class='product_titel']");
	By prod=By.xpath("//img [@alt='3-Pack Travel Wet Wipes 10 Count']");
	
	/*By prod=By.xpath("//img [@alt='Premium 75% Alcohol Wipes, 40 count pack']");
	By zoom=By.xpath("//div[@class='scale-ico fa-search-plus']");
	By plus =By.xpath("//div[@class='eagle-scale']/div[2]");
	By minus =By.xpath("//div[@class='eagle-scale']/div[1]");
	By zoomclose=By.cssSelector("div[class='eagle-close']");
	By quantity=By.cssSelector("input[name='picquantity']");*/
	
	
	public Searchbuttonpg(WebDriver driver) {
	 this.driver=driver;
	 
	}
	public WebElement Searchproduct() {
		return driver.findElement(Search);
	}
  public WebElement EnterProduct() {
	  return driver.findElement(Enter);
  }

  public WebElement productname() {
	  return driver.findElement(prodname);
  }
   public WebElement MainProduct() {
	   
       return driver.findElement(prod);
       
 
  
   }
}

