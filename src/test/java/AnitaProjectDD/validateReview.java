package AnitaProjectDD;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DDhomePage;
import pageObjects.ReviewPage;
import pageObjects.Searchbuttonpg;
import pageObjects.loginpageDD;
import resources.base;

public class validateReview extends base {
private static Logger log=LogManager.getLogger(base.class.getName());
	

	@Test
	public void reviewPage() throws IOException, InterruptedException {
		driver =initializeDriver();
		log.info("Driver is initialized");
		driver.get( prop.getProperty("url"));
		log.info("Navigated to home page");
		driver.manage().window().maximize();
		log.info("Screen is maximized");
		
DDhomePage dl= new DDhomePage(driver);
		
		dl.homesignin().click();  
		dl.Usign().click();
		
		
		loginpageDD ld= new loginpageDD(driver);
		ld.emailid().sendKeys("srikanthtesting100@gmail.com");
		ld.password().sendKeys("password123");
		ld.final_signin().click();
		log.info("signed in");
		String actualUrl="https://www.dollardays.com/";
		String expectedUrl= driver.getCurrentUrl();
	   
			
		if(expectedUrl.equals(actualUrl)) {
		Searchbuttonpg sb= new Searchbuttonpg(driver);
		sb.Searchproduct().sendKeys("Wipes");
		sb.EnterProduct().click();
		int j=0;
		String n=sb.productname().getText();
		String name="3-Pack Travel Wet Wipes 10 Count";
	   
		if (n.contains(name)) {
			j++;
		
		sb.MainProduct();
		
		}else {
			sb.Searchproduct().sendKeys("3-Pack Travel Wet Wipes 10 Count");
			sb.EnterProduct().click();
			sb.MainProduct().click();
		}
		
		
       ReviewPage vr= new ReviewPage(driver);
       vr.writereviewbtn().click();
       vr.rating().click();
      
       vr.titlereview().sendKeys("product is good");
       
     String re=("The Product quality is good and i highly recommend it");
     vr.WriteReview().sendKeys(re);
     vr.Submitreview().click();
     
     vr.texreview();
     
     Assert.assertEquals(vr.texreview().getText(), "write review");
		
		log.error("The text is incorrect");
		
		vr.aftersubmitting().getText();
		log.info("Thanks for submitting the review- text is found");
	}
		driver.close();
	}
}