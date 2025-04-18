package org.bookhotel;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClass{
	
	
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstname;
	
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastname;
	
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address;
	
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement ccnum;
	
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement cctype;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement ccexpmonth;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement ccexpyear;
	
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvvnum;
	
	
	@FindBy(xpath="//input[@type='button']")
	private WebElement boooknowbtn;
	
	
	
	public WebElement firstname() {
		return firstname;
	}
	
	public WebElement lastname() {
		return lastname;
	}
	
	public WebElement address() {
		return address;
	}
	
	public WebElement ccnum() {
		return ccnum;
	}
	
	public WebElement cctype() {
		return cctype;
	}
	
	public WebElement ccexpmonth() {
		return ccexpmonth;
	}
	
	public WebElement ccexpyear() {
		return ccexpyear;
	}
	
	public WebElement cvvnum() {
		return cvvnum;
	}
	
	public WebElement boooknowbtn() {
		return boooknowbtn;
	}

}
