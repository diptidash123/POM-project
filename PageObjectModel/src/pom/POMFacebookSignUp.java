package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POMFacebookSignUp 
{
  @FindBy(xpath="(//input[@type='text'])[1]")
  private WebElement FirstnameTextfield;
  
  @FindBy(xpath="(//input[@type='text'])[2]")
  private WebElement SurnameTextfield;
  
  @FindBy(xpath="(//input[@type='text'])[3]")
  private WebElement MobileoremailTextfield;
  
  @FindBy(xpath="(//input[@type='text'])[4]")
  private WebElement ReemailTextfield;
  
  
  @FindBy(xpath="(//input[@type='password'])[2]")
  private WebElement PasswordTextfield;
  
  @FindBy(xpath="//select[@id='day']")
  private WebElement dropdownlistDay;
  
  @FindBy(xpath="//select[@id='month']")
  private WebElement dropdownlistMonth;
  
  @FindBy(xpath="//select[@id='year']")
  private WebElement dropdownlistYear;

  @FindBy(xpath="(//input[@type='radio'])[2]")
  private WebElement MaleradioButton;
  
  public POMFacebookSignUp(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void TextfieldMethod() throws InterruptedException
  {
	  FirstnameTextfield.sendKeys("bahubali");
	  Thread.sleep(3000);
	  SurnameTextfield.sendKeys("katapa");
	  Thread.sleep(3000);
	  MobileoremailTextfield.sendKeys("bahubali@gmail.com");
	  Thread.sleep(5000);
	  ReemailTextfield.sendKeys("bahubali@gmail.com");
	  Thread.sleep(3000);
	  PasswordTextfield.sendKeys("bahubali");
  }
  
  public void dropdownDayMethod() throws InterruptedException
  {
	  Thread.sleep(3000);
	  Select sel=new Select(dropdownlistDay);
	  sel.selectByValue("10");
  }
  
  public void dropdownMonthMethod() throws InterruptedException
  {
	  Thread.sleep(3000);
	  Select sel=new Select(dropdownlistMonth);
	  sel.selectByVisibleText("Jul");
  }
  
  public void dropdownYearMethod() throws InterruptedException
  {
	  Thread.sleep(3000);
	  Select sel=new Select(dropdownlistYear);
	  sel.selectByVisibleText("2020");
  }
  
  public void radioMethod() throws InterruptedException
  {
	  Thread.sleep(3000);
	  MaleradioButton.click();
  }
  
  
  
  
}
