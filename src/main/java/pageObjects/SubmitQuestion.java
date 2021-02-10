package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubmitQuestion {
	public WebDriver driver;
	
	By writeq= By.id("txtItem_Question");
	By submit=By.xpath("//input[@class='btn processbtn btnquestionSubmit']");
	By reviewbtn=By.xpath("//a[contains(text(),'Be the first to write a review')]");
	By Thanks =By.xpath("//div[contains(text(),'Thanks for submitting question.')]");
	
	
public SubmitQuestion(WebDriver driver) {
	this.driver=driver;
	
}
public WebElement question() {
	return driver.findElement(writeq);
	
}
public WebElement submit() {
	return driver.findElement(submit);
}
public WebElement thanksfor() {
	return driver.findElement(Thanks);
	
}

}
