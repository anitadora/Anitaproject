package AnitaProjectDD;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.DDhomePage;
import pageObjects.Searchbuttonpg;
import pageObjects.SubmitQuestion;
import pageObjects.loginpageDD;
import resources.base;

public class Submitques extends base {
	
private static Logger log=LogManager.getLogger(base.class.getName());
	

	@Test
	public void SubmitQ() throws IOException, InterruptedException {
		driver =initializeDriver();
		log.info("Driver is initialized");
		driver.get( prop.getProperty("url"));
		log.info("Navigated to home page");
		driver.manage().window().maximize();
		log.info("Screen is maximized");
		
DDhomePage dl= new DDhomePage(driver);
		
		dl.homesignin().click();  //driver.findelement(By..xpath("//i[@class='fa fa-chevron-down']")
		dl.Usign().click();
		
		
		loginpageDD ld= new loginpageDD(driver);
		ld.emailid().sendKeys("srikanthtesting100@gmail.com");
		ld.password().sendKeys("password123");
		ld.final_signin().click();
		
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
		
		
		SubmitQuestion rp= new SubmitQuestion(driver);
		
		rp.question().sendKeys("Very nice Product.Love it so much.");
		rp.submit().click();
		rp.thanksfor().getText();
		log.info("Question sent successfully");
		
		}
      driver.close();
		}
}