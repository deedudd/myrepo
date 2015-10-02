package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class orange {

	public static void main(String[] args) throws IOException {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("intl.accept_languages","fr");
		FirefoxDriver driver = new FirefoxDriver(profile);
		
		FileInputStream f1 = new FileInputStream("C:\\Users\\Deepu\\workspace\\HelloWorld\\src\\project\\com.qedge.excelfiles\\orangehrm.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f1);
		XSSFSheet ws = wb.getSheet("sheet1");
		
		driver.get("http://opensource.demo.orangehrm.com");
		
		Iterator<Row> row = ws.iterator();
		row.next();
		
		while(row.hasNext())
		{
			
		Row r = row.next();
		driver.findElement(By.id("txtUsername")).sendKeys(r.getCell(0).getStringCellValue());
		driver.findElement(By.id("txtPassword")).sendKeys(r.getCell(1).getStringCellValue());
		driver.findElement(By.id("btnLogin")).click();
		
		String expurl = "http://opensource.demo.orangehrm.com/index.php/dashboard";
		String acturl = driver.getCurrentUrl();
		if(acturl.equals(expurl))
			{
				r.createCell(2).setCellValue("passed");
			}
		}
		XSSFSheet ws1 = wb.getSheet("sheet2");
		Iterator<Row> row1 = ws1.iterator();
		row1.next();
		
		while(row1.hasNext())
		{
			
		Row r1 = row1.next();
		driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(r1.getCell(0).getStringCellValue());
		driver.findElement(By.id("lastName")).sendKeys(r1.getCell(1).getStringCellValue());
		driver.findElement(By.id("chkLogin")).click();
		driver.findElement(By.xpath("//*[@id='user_name']")).sendKeys(r1.getCell(2).getStringCellValue());
		driver.findElement(By.id("user_password")).sendKeys(r1.getCell(3).getStringCellValue());
		driver.findElement(By.id("re_password")).sendKeys(r1.getCell(4).getStringCellValue());
		
		driver.findElement(By.xpath("//*[@id='btnSave']")).click();
		
		String expurl = "http://opensource.demo.orangehrm.com/index.php/pim/viewPersonalDetails/empNumber/0153";
		String acturl = driver.getCurrentUrl();
		if(acturl.equals(expurl))
			{
				r1.createCell(5).setCellValue("passed");
			}
		}
		
		FileOutputStream f2 = new FileOutputStream("C:\\Users\\Deepu\\workspace\\HelloWorld\\src\\project\\com.qedge.resultexcelsheets\\orangehrm.xlsx");
		wb.write(f2);
		f2.close();
	}



	}

