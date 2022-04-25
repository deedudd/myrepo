

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class dropdowncomp {
public static void main(String[] args) throws InterruptedException
{
	System.out.println("hellogou");
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://goair.in");
	WebElement x = driver.findElement(By.xpath("//*[@id='departureCitysearchBoxUserControlCriteriaBox']"));
	List<WebElement> dropdown1 = x.findElements(By.tagName("option"));
	
	WebElement y;
	List<WebElement> dropdown2;
	
	for (int i=0;i<dropdown1.size();i++)
	{
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		dropdown1.get(i).click();
		y = driver.findElement(By.xpath("//*[@id='toCitysearchBoxUserControlCriteriaBox']"));
		dropdown2 = y.findElements(By.tagName("option"));
		Thread.sleep(2000);
		for (int j=0;j<dropdown2.size();j++)
		{
			if(dropdown1.get(i).getText().equals(dropdown2.get(j).getText()))
			System.out.println(dropdown2.get(j).getText()+" is not working");
		}
		System.out.println(dropdown1.get(i).getText()+ "  is working");
	}
}
}
