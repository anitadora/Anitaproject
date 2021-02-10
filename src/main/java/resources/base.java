package resources;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	
	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException  {
		
	   prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\ranja\\eclipse-workspace\\DollarDays\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String Bname= prop.getProperty("browser");
		if (Bname.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranja\\Downloads\\Qa downloads\\chromedriver.exe");
			 driver= new ChromeDriver();
			
					
		}
		else if (Bname.equals("Firefox")) {
			System.setProperty("webdriver,firefox.driver", "C:\\Users\\ranja\\Downloads\\Qa downloads\\geckodriver.exe");
			 driver= new FirefoxDriver();
		}
		else if (Bname.equals("IE")) {
			System.setProperty("webdriver.ie.driver","C:\\Users\\ranja\\Downloads\\Qa downloads\\IEDriverServer.exe" );
			 driver = new InternetExplorerDriver();
		}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;
			
			
		}
	
	
public String getScreenShotPath(String testCaseName,WebDriver driver)throws IOException {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	String destinationFile=System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	
	FileUtils.copyFile(source,new File(destinationFile));
	return destinationFile;
}
	
}
	
	


