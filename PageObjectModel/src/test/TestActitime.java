package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.POMactitimeCustomerpage;
import pom.POMactitimeLoginpage;
import pom.POMactitimeTypesofworkFilepage;
import pom.POMactitimeleaveTypespage;

public class TestActitime 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		
		POMactitimeLoginpage login=new POMactitimeLoginpage(driver);
		login.loginMethod();
		//login.forgotyourpasswordMethod();
        // login.actimeIncMethod();
        
        POMactitimeCustomerpage customer=new POMactitimeCustomerpage(driver);
        customer.customerMethod();
        customer.createcustomerMethod();
        customer.deletecustomer();
        //customer.cancelcustomer();
		
		/*POMactitimeTypesofworkFilepage work=new POMactitimeTypesofworkFilepage(driver);
		work.createtypeofworkworkMethod();
		work.deleteMethod();*/
		
		/*POMactitimeleaveTypespage leavework=new POMactitimeleaveTypespage (driver);
		leavework.leavetypeMethod();
		leavework.deleteMethod();*/
	}

}
