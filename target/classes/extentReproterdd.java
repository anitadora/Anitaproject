package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReproterdd {
   static ExtentReports Extent;
   
	public static ExtentReports getReportObject() {
		
		String path = System.getProperty("user.dir")+ "\\reports\\index.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
			reporter.config().setReportName("Web Automation Results");// customize our report name and document title
			reporter.config().setDocumentTitle("Test Result");
		ExtentReports extent= new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Anita");
		return extent;
		
		
	}
}
