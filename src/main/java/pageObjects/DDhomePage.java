package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DDhomePage {
 public WebDriver driver;
 
 
 
  By signin= By.xpath("//i[@class='fa fa-chevron-down']");
  By USign=By.linkText("Sign In");
  
  
 

public DDhomePage(WebDriver driver) {
	this.driver=driver;

}


public WebElement homesignin() {
	  return driver.findElement(signin);
	  
  }
 public WebElement Usign() {
	 return driver.findElement(USign);
 }



 
}
