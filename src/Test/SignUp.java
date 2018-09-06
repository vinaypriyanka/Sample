package Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Resource.Base;
import main.LoginPage;

public class SignUp extends Base {

	
	 @Test public void clickSignUp(){
	  
	  LoginPage l1=new LoginPage(driver);
	  l1.enterMobile().sendKeys("9742571915"); }
	 

	

	
}
