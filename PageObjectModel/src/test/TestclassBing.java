package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.POMBingAutosuggestions;

public class TestclassBing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		
		POMBingAutosuggestions bing=new POMBingAutosuggestions(driver);
		bing.bingMethod();
		//bing.bingIndexMethod();
		//bing.ifelsebingMethod();
		bing.arrowdownMethod();
	}

}
