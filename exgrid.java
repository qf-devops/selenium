import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class seleniumex {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		seleniumex selObj = new seleniumex();
		selObj.seltestcase1();
		selObj.seltestcase2();
		selObj.loginBrowser();
		selObj.seltestcase01();
	}
	public void seltestcase01() throws InterruptedException, MalformedURLException {
	    String URL = "https://www.google.com/";
		String Node = "http://192.168.32.1:4444/wd/hub";
		DesiredCapabilities cap = DesiredCapabilities.firefox();

		WebDriver driver = new RemoteWebDriver(new URL(Node), cap);

		driver.navigate().to(URL);
		Thread.sleep(5000);
		driver.quit();
	}		

	public void seltestcase1() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/ravi/Downloads/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.print(driver.getTitle());
		if(driver.getPageSource().contains("I'm Feeling Lucky")) {
		  System.out.println("Test case1 success");
		}
		else {
			System.out.println("Test case1 failed");
		}
		Thread.sleep(500);
		driver.close();
	}
	public void seltestcase2() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/ravi/Downloads/geckodriver");
		FirefoxBinary firefoxBinary = new FirefoxBinary();
		firefoxBinary.addCommandLineOptions("--headless");
		FirefoxOptions firefoxOptions = new FirefoxOptions();
	    firefoxOptions.setBinary(firefoxBinary);
		WebDriver driver = new FirefoxDriver(firefoxOptions); 
		driver.get("https://www.google.com/");
		System.out.print(driver.getTitle());
		if(driver.getPageSource().contains("I'm Feeling Lucky")) {
		  System.out.println("Test case1 success");
		}
		else {
			System.out.println("Test case1 failed");
		}
		Thread.sleep(500);
		driver.close();
	}
	public void loginBrowser() { 
		System.setProperty("webdriver.gecko.driver", "/Users/ravi/Downloads/geckodriver");
		FirefoxBinary firefoxBinary = new FirefoxBinary();
		firefoxBinary.addCommandLineOptions("--headless");
		FirefoxOptions firefoxOptions = new FirefoxOptions();
	    firefoxOptions.setBinary(firefoxBinary);
		WebDriver driver = new FirefoxDriver(firefoxOptions); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); 
		driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.facebook.com"); 
		driver.findElement(By.name("email")).sendKeys("Your Facebook Email Id");
		driver.findElement(By.name("pass")).sendKeys("Your Password");
		driver.findElement(By.id("loginbutton")).click();
		driver.close();
		}

}
