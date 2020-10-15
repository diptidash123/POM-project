package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.POMGoogleAutosuggestions;


public class Testclassgoogle 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		POMGoogleAutosuggestions autosuggest=new POMGoogleAutosuggestions(driver);
		autosuggest.googleMethod();
		//autosuggest.indexMethod();
		//autosuggest.ifelseMethod();
		autosuggest.ArrowMethod();
		

	}

}
