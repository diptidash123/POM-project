package pom;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMBingAutosuggestions 
{
  @FindBy(xpath="//input[@id='sb_form_q']")
  private WebElement searchTextfield;
  
  @FindBy(xpath="//span[contains(text(),'selenium ')]")
  private List<WebElement> suggestions;
  
  
public POMBingAutosuggestions(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void bingMethod() throws InterruptedException
{
	searchTextfield.sendKeys("selenium");
	Thread.sleep(3000);
	System.out.println(suggestions.size());
	
	for(int i=0;i<suggestions.size();i++)
	{
		System.out.println(suggestions.get(i).getText());
	}
}
	
public void bingIndexMethod()
{
	suggestions.get(1).click();
}

public void ifelsebingMethod()
{
	for(int i=0;i<suggestions.size();i++)
	{
		if(suggestions.get(i).getText().equals("selenium tutorial point"))
		{
			System.out.println(suggestions.get(i).getText());
			suggestions.get(i).click();
			break;
		}
	}
		
}

public void arrowdownMethod()
{
	for(int i=0;i<=1;i++)
	{
		searchTextfield.sendKeys(Keys.ARROW_DOWN);
	}
	searchTextfield.sendKeys(Keys.ENTER);
}
		
		
}

