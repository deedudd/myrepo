
import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class goair {
	org.openqa.selenium.firefox.ProfilesIni pr = new org.openqa.selenium.firefox.ProfilesIni();
	FirefoxProfile fp = pr.getProfile("SeleniumUser");
	FirefoxDriver driver = new FirefoxDriver();
	@Test
	public void dropdown() throws InterruptedException
	{
	driver.get("http://www.angelfire.com/super/badwebs/");
//	driver.findElement(By.id("departureCitysearchBoxUserControlCriteriaBox")).click();
//	driver.findElement(By.id("departureCitysearchBoxUserControlCriteriaBox")).sendKeys("Ahmedabad");

//	driver.findElement(By.id("toCitysearchBoxUserControlCriteriaBox")).click();
List<WebElement> myframes = driver.findElements(By.tagName("frame"));
System.out.println(myframes.size());
for(int i=0;i<3;i++)
{
	try {
		driver.switchTo().frame(i);
		String x = driver.findElement(By.xpath("")).getText();
		System.out.println("myprint"+i+x);
		break;
	} 
	catch(Exception e)
	{
		driver.switchTo().defaultContent();
	}
}
		
	}
}
