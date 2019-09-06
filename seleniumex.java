import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumex {

	public static void main(String[] args) throws InterruptedException {
		seleniumex selObj = new seleniumex();
		selObj.seltestcase1();
		selObj.seltestcase2();
		selObj.loginBrowser();
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
	public void loginBrowser() { 
		System.setProperty("webdriver.gecko.driver", "/Users/ravi/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver(); 
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
