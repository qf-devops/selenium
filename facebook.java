
package FacebookDemos;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FacebookLogin {
public static void main(String[] args) {
// TODO Auto-generated method stub
FacebookLogin obj = new FacebookLogin(); obj.loginBrowser();
}
public void loginBrowser() { 
System.setProperty("webdriver.firefox.marionette","D:\\geckodriver.exe"); 
WebDriver driver = new FirefoxDriver(); 
driver.manage().window().maximize();
driver.manage().deleteAllCookies(); 
driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS); 
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("http://www.facebook.com"); 
driver.findElement(By.name("email")).sendKeys("Your Facebook Email Id");
driver.findElement(By.name("pass")).sendKeys("Your Password");
driver.findElement(By.id("loginbutton")).click();
}
}
