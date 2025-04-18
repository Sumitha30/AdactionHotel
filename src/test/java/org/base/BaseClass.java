package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver = new ChromeDriver();

	
	public static WebDriver browserLaunch(String bname) {
		
		switch(bname) {
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		}
		
		return driver;
	
	}
	
	public static WebDriver urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
	public static WebDriver implicityWait(int w) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(w));
		return driver;
	}
	
	 public static void explicitWaitForElement(WebElement element, int timeout) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
	        wait.until(ExpectedConditions.visibilityOf(element));
	    }
	 
	public static void sendKeys(WebElement e, String t) {
		e.sendKeys(t);

	}

	public static void click(WebElement e) {
		e.click();
	}
	
	public static WebDriver navigate() {
		driver.navigate().back();
		return driver;
	}
	
	
	public static String readExcel(String filename, String sheet, int row, int c) throws IOException {
		
		File f = new File("/Users/sumithasivabalan/eclipse-workspace/MavenProjectXls/src/test/resources/Excel/Data.xlsx");
		FileInputStream st = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(st);
		Sheet s = w.getSheet(sheet);
		Row r = s.getRow(row);
		Cell cell = r.getCell(c);
	
		
		int type = cell.getCellType();
	
		
		String value  = null;
		
		if(type==1) {
			 value = cell.getStringCellValue();
	
		}else {
			if(DateUtil.isCellDateFormatted(cell)){
				Date dateCellValue =cell.getDateCellValue();
				SimpleDateFormat sd = new SimpleDateFormat("dd-MMM-yyyy");
				 value = sd.format(dateCellValue);
				
			}else {
				double numericCellValue = cell.getNumericCellValue();
				long num =(long)numericCellValue;
				 value= String.valueOf(num);
			}
		}
		
		return value;
	}
	
	public static void takeScreenshot(String filename) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("/Users/sumithasivabalan/Sumitha/ScreenShots/" + filename +".png");
        FileUtils.copyFile(src, dest);


	}
	
	public static boolean exceptionHandle(WebElement e) {
		try {
			if (e != null && e.isDisplayed()) {
	            return true;
	            }
			}catch (Exception ex) {
		        System.out.println("Element not found or not visible: " + ex.getMessage());

		}
	    return false;

	}
	
	
	
	public static void selectDropdownByIndex(WebElement dropdownElement, int index) {
	    Select dropdown = new Select(dropdownElement);
	    dropdown.selectByIndex(index);
	    dropdownElement.click();
	}
	
	
}
