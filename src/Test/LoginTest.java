package Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resource.Base;
import main.LoginPage;

public class LoginTest extends Base{

	
	
	@BeforeTest
	public void initialize() throws IOException{
		driver=initializeDriver();
		driver.manage().window().maximize();
	}
	
	
	
	
	
	@Test
	public void fillForm(){
		LoginPage l= new LoginPage(driver);
		l.enterFirstName().sendKeys("vinay");
		l.enterLastName().sendKeys("kumar");
	
		
	}
}
