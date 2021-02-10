package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class alertbtn {
	
	public WebDriver driver;
	
	By alrtbtn=By.id("exampleModalLabel");
	
	
	By crossbutton=By.xpath("//body/div[@id='confirmationBox']/div[1]/div[1]/div[1]/button[1]");

	
	public alertbtn(WebDriver driver) {
		this.driver=driver;
	}
	
	 public WebElement alertbutton() {
		  
		  return driver.findElement(alrtbtn);
		  
			
		  
	  }
	  public WebElement crossbutton() {
		  return driver.findElement(crossbutton);
	  }

}
