package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class hover {
ProfilesIni pr = new ProfilesIni();
FirefoxProfile fp = pr.getProfile("SeleniumUser");
FirefoxDriver driver = new FirefoxDriver(fp);
@Test
public void hovertest() throws InterruptedException
{
	driver.get("http://yssofindia.org/");
	Thread.sleep(5000);
	Actions action = new Actions(driver); 
	WebElement event1 = driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/a/img"));
	WebElement event2 = driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/ul/li[9]/a"));
	WebElement event3 = driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[15]/a/img"));
	Thread.sleep(1000);
//	action.moveToElement(event1).moveToElement(event2).click().build().perform();
	action.contextClick(event3).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(1000);
}


}
