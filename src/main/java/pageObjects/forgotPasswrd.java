package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class forgotPasswrd {
public WebDriver driver;



By forgotpassword= By.xpath("//a[contains(text(),'Forgot your email address or password?')]");
By entermyemail=By.id("ctl00_cphContent_txtEmailAddress");
By lookup=By.id("ctl00_cphContent_btnSearch");

public forgotPasswrd(WebDriver driver) {
	this.driver=driver;
		
}
public WebElement forgot() {
	return driver.findElement(forgotpassword);
			
	
}
public WebElement myemail() {
	return driver.findElement(entermyemail);
}
public WebElement clicklookup() {
	return driver.findElement(lookup);
}
}

