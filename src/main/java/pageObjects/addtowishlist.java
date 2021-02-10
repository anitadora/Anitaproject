package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class addtowishlist {
public WebDriver driver;

By clickwish= By.xpath("//input[@class='fakesubmit cart_newbtn btn dd-btn dd-btn-secondary wishlitproductreq']");
By gettxt=By.xpath("//div[@class='wishlistaddresult']");

public  addtowishlist(WebDriver driver) {
	this.driver=driver;
}


public WebElement addwish() {
	return driver.findElement(clickwish);
}
public WebElement getwishtext() {
	return driver.findElement(gettxt);
}

}
