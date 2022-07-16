package testCases;

import org.testng.annotations.Test;

import utilities.ScreenshotCapture;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class BaseClass {

	WebDriver driver;
	ScreenshotCapture scr;
	public static Properties ps;

	public static void testBasic() throws IOException {
		ps = new Properties();
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\resources\\Properties\\Config.properties");
		ps.load(file);

	}


	@BeforeMethod
	@Parameters("Browser")
	public void beforeMethod(String browserName) throws IOException {

		testBasic();

		if (browserName.equals("Chrome")) {
			System.setProperty(ps.getProperty("ChromeDriver"),
					System.getProperty("user.dir") + ps.getProperty("ChromeDriverPath"));
			driver = new ChromeDriver();
		} else if (browserName.equals("FireFox")) {
			System.setProperty(ps.getProperty("FireFoxDriver"),
					System.getProperty("user.dir") + ps.getProperty("FireFoxDriverPath"));
			driver = new FirefoxDriver();
		} else if (browserName.equals("Edge")) {
			System.setProperty(ps.getProperty("EdgeDriver"),
					System.getProperty("user.dir") + ps.getProperty("EdgeDriverPath"));
			driver = new EdgeDriver();
		}
		driver.get(ps.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	}

	@AfterMethod
	public void afterMethod(ITestResult itestResult) throws IOException {
		if (itestResult.getStatus() == ITestResult.FAILURE) {
			scr = new ScreenshotCapture();
			scr.captureScreenshot(driver, itestResult.getName());
		}
		driver.close();
	}

}
