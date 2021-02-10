package AnitaProjectDD;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.DDhomePage;
import pageObjects.Searchbuttonpg;
import pageObjects.addtowishlist;
import pageObjects.alertbtn;
import pageObjects.forgotPasswrd;
import pageObjects.loginpageDD;
import pageObjects.pageDescription;
import resources.base;

public class HomePage extends base {
	
	private static Logger log=LogManager.getLogger(base.class.getName());
	

	@Test(dataProvider="getData")
	public void basePageNavigation(String Uname, String Passwrd) throws IOException, InterruptedException {
		driver =initializeDriver();
		log.info("Driver is initialized");
		driver.get( prop.getProperty("url"));
		log.info("Navigated to home page");
		driver.manage().window().maximize();
		log.info("Screen is maximized");
		
		//1. inheritance as we did in class using extend - to access base page
		//2. create objects to access methods of other class
	
		DDhomePage dl= new DDhomePage(driver);
		
		dl.homesignin().click();  //driver.findelement(By..xpath("//i[@class='fa fa-chevron-down']")
		dl.Usign().click();
		
		
		loginpageDD ld= new loginpageDD(driver);
		ld.emailid().sendKeys(Uname);
		ld.password().sendKeys(Passwrd);
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
		
		sb.MainProduct().click();
		
		}else {
			sb.Searchproduct().sendKeys("3-Pack Travel Wet Wipes 10 Count");
			sb.EnterProduct().click();
			sb.MainProduct().click();
		}
		
		pageDescription pg= new pageDescription(driver);
	    
		pg.zoombutton().click();
		Thread.sleep(3000);
		pg.plusbutton().click();
		pg.minusbutton().click();
		pg.zoomclose().click();
		pg.quantity().clear();
		pg.quantity().sendKeys("10");
		pg.addcart().click();
		Thread.sleep(3000);
		pg.quantity().clear();
		pg.quantity().sendKeys("1000000000000");
		pg.addcart().click();
		
		alertbtn al= new alertbtn(driver);
		Thread.sleep(3000);
		al.crossbutton().click();
		
		addtowishlist ad= new addtowishlist(driver);
		
		ad.addwish().click();
		ad.getwishtext().getText();
		log.info("Added to wishlist");
		
		}
	
		
		else {
	   forgotPasswrd fp= new forgotPasswrd(driver);
		fp.forgot().click();
		fp.myemail().sendKeys("anitadora@gmail.com");
		fp.clicklookup().click();
		driver.close();
		
	}
	   
		
	}	
		

		
		
	

	
	
	@DataProvider
	public Object[][] getData() {
		Object [][] data= new Object[2][2];
		data[0][0]="srikanthtesting100@gmail.com";
		data[0][1]="password123";
		System.out.println("Login Success");
		data [1][0]="anitadora@yahoo.com";
		data [1][1]="12345";
		System.out.println("Login failed");
		return data;
	
	}
	
		
			
	
	

}
	
			
			
		
		
		
		
		
	
	
	
	
			


