package Resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public static WebDriver driver;
	public static Properties prop;

	public static WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:\\Project TestNG\\Sample\\src\\Resource\\data.properties");
		
		prop.load(fis);
		String Browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		if (Browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);

		} else if (Browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);

		}

		return driver;

	}

	public void takeShot() throws IOException {
		Date date = new Date();
		String v = date.toString();
		System.out.println(v);
		String v1 = v.replaceAll(":", "-");

		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\" + v1 + "png");
		FileUtils.copyFile(src, dest);
	}

	public void readText() throws IOException {

		FileInputStream fs = new FileInputStream("D:\\prone.txt");
		int x = 0;
		while ((x = fs.read()) != -1) {
			System.out.print((char) x);

		}

	}

	public static void main(String[] args) throws IOException {
		Base.initializeDriver();
	}
}
