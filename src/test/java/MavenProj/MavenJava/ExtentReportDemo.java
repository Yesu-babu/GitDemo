package MavenProj.MavenJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtentReportDemo {

	@BeforeTest
	public void config()
	{
		//Extent Report,ExtentSparkReporter classes are helpful to store reports
		String path=System.getProperty("users.dir")+"\\reports\\index.html";
		ExtentSparkReporter r=new ExtentSparkReporter();
	}

@Test
public void initialDemo()
{
	System.setProperty("webdriver.chrome.driver","C:/browserdrivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com");
	System.out.println(driver.getTitle());
	
}

}
