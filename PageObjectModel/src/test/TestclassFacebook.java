package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.POMFacebookSignUp;

public class TestclassFacebook 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		
		POMFacebookSignUp fb=new POMFacebookSignUp(driver);
		fb.TextfieldMethod();
		fb.dropdownDayMethod();
		fb.dropdownMonthMethod();
		fb.dropdownYearMethod();
		fb.radioMethod();
	}

}
