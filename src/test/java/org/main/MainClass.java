package org.main;
import java.time.Duration;

import org.base.BaseClass;
import org.bookhotel.BookHotel;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.login.Login;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.reg.RegistrationClass;
import org.searchhotel.SearchHotel;

import junit.framework.Assert;


public class MainClass extends BaseClass{
	
		
		@BeforeClass
		public static void setup() {
			
			browserLaunch("chrome");
			urlLaunch("https://adactinhotelapp.com/");
			implicityWait(10);
			
		}

		@Test
		public void testLogin() throws InterruptedException {
			
			RegistrationClass r = new RegistrationClass();
			
			click(r.register());
			
			sendKeys(r.username(),"SumiSiva@gmail.com");
			Assert.assertEquals("SumiSiva@gmail.com", r.username().getAttribute("value"));

			
			sendKeys(r.password(),"sumitha30");
	
			sendKeys(r.repassword(),"sumitha30");
	
			sendKeys(r.fullname(),"Sumitha Sivabalan");
	
			sendKeys(r.email(),"sumithajapril30@gmail.com");
	
			
			System.out.println("Please enter the CAPTCHA manually: ");
			Thread.sleep(10000); 
			
			click(r.checkbox());
			click(r.submit());
			
	
		        if (exceptionHandle(r.userspan())) {
		            System.out.println("Username already exists! Navigating back to login...");
		            driver.navigate().back();
		            Thread.sleep(2000); 
		            driver.navigate().back();
		        }
		        
				Thread.sleep(2000); 
		        
				driver.navigate().refresh();
				
			//---------------Login-------------
			Login l = new Login();
			
			sendKeys(l.username(), "SumiSiva");
			sendKeys(l.password(), "sumitha30");
			
			click(l.login());
			
			
			//------------SearchHotel----------------

		SearchHotel sh = new SearchHotel();
			
		click(sh.location());
	    selectDropdownByIndex(sh.location(), 1);
	    
		click(sh.hotelname());
		selectDropdownByIndex(sh.hotelname(), 2);
		
		click(sh.roomtype());
		selectDropdownByIndex(sh.roomtype(), 2);
		
		
		click(sh.adultroom());
		selectDropdownByIndex(sh.adultroom(), 2);
		
		
		click(sh.childroom());
		selectDropdownByIndex(sh.childroom(), 2);
		
		click(sh.submitbtn());
		
		click(sh.radiobtn());
		
		click(sh.continuebtn());
		
		
		
		//-----------------Book Hotel--------------------

		BookHotel bh = new BookHotel();
		
		sendKeys(bh.firstname(), "Sumitha");
		
		sendKeys(bh.lastname(), "Sivabalan");
		
		sendKeys(bh.address(), "51B East Street, Ayankulam");
		
		sendKeys(bh.ccnum(), "4111 1111 1111 1111	");
		
		click(bh.cctype());
		selectDropdownByIndex(bh.cctype(), 2);
		
		click(bh.ccexpmonth());
		selectDropdownByIndex(bh.ccexpmonth(), 4);
		
		click(bh.ccexpyear());
		selectDropdownByIndex(bh.ccexpyear(), 5);
		
		
		sendKeys(bh.cvvnum(), "236678888");
		
		click(bh.boooknowbtn());
			
			
		}
	
		

			  @AfterClass
			    public static void tearDown() {
				  //driver.quit();
				  System.out.println("DONE");
			  }
			




}
