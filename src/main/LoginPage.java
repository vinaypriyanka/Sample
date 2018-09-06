package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@aria-label='Mobile number or email address']")
	WebElement mobile;
	
	
	
	/*By firstName = By.xpath("//input[@name='firstname']");
	By lastName = By.xpath("//input[@name='lastname']");
	By mobile = By.xpath("//input[@aria-label='Mobile number or email address']");
*/
	public WebElement enterFirstName() {

		return firstName;
	}
	
	public WebElement enterLastName() {

		return lastName;
	}
	
	public WebElement enterMobile() {

		return mobile;
	}
}
