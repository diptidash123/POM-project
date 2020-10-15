package pom;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMGoogleAutosuggestions
{

	@FindBy(xpath="//input[@type='text']")
    private WebElement searchTextfield;
	
	@FindBy(xpath="//span[contains(text(),'selenium')]")
	private List<WebElement> suggestions;
 

public POMGoogleAutosuggestions(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


public void googleMethod() throws InterruptedException
{
	searchTextfield.sendKeys("selenium");
	Thread.sleep(3000);
	System.out.println(suggestions.size());
	for(int i=0;i<suggestions.size();i++)
	{
		System.out.println(suggestions.get(i).getText());
	}
}

public void indexMethod()
{
	suggestions.get(2).click();
}

public void ifelseMethod()	
{
	for(int i=0;i<suggestions.size();i++)
	{
		if(suggestions.get(i).getText().equals("selenium video"))
		{
			System.out.println(suggestions.get(i).getText());
			suggestions.get(i).click();
			break;
		}
	}
}
	
public void ArrowMethod()
	{
		for(int i=0;i<=3;i++)
		{
			searchTextfield.sendKeys(Keys.ARROW_DOWN);
		}
		searchTextfield.sendKeys(Keys.ENTER);
	
		
	}
	
	
}