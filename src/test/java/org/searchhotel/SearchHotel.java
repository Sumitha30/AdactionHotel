package org.searchhotel;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass{
	
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement location;
	
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotelname;
	
	
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomtype;
	
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adultroom;
	
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement childroom;
	
	
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitbtn;
	
	
	@FindBy(id="continue")
	private WebElement continuebtn;
	
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement radiobtn;
	
	
	public WebElement location() {
		return location;

	}
	
	public WebElement hotelname() {
		return hotelname;

	}
	
	public WebElement roomtype() {
		return roomtype;

	}
	
	public WebElement adultroom() {
		return adultroom;

	}
	
	public WebElement childroom() {
		return childroom;

	}
	
	public WebElement submitbtn() {
		return submitbtn;

	}
	
	public WebElement continuebtn() {
		return continuebtn;

	}
	
	public WebElement radiobtn() {
		return radiobtn;

	}

}
