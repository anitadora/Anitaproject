package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReviewPage {

public WebDriver driver;
	
	By click= By.xpath("//a[@class='btn processbtn btnreviewwrite ']");
	
	By areview=By.xpath("//h3[contains(text(),'Write a review')]");
	By stars=By.xpath(" //a[contains(text(),'3 Stars')]");
	By title=By.id("txtreview_title");
	By review=By.id("txtreview_review");
	By submitreview=By.xpath("//input[@value='Submit Review']");
	By response=By.xpath("//div[contains(text(),'Thanks for submitting review.')]");
	
	
	public  ReviewPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement writereviewbtn() {
		return driver.findElement(click);
		
	}
	public WebElement texreview() {
		return driver.findElement(areview);
	}
	public WebElement rating() {
		return driver.findElement(stars);
	}
	public WebElement titlereview() {
		return driver.findElement(title);
	}
	public WebElement WriteReview() {
		return driver.findElement(review);
	}
	
	public WebElement Submitreview() {
		return driver.findElement(submitreview);
	
	}
	public WebElement aftersubmitting() {
		return driver.findElement(response);
	}
}


