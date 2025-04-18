package org.login;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass{
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;


	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='login']")
	private WebElement login;
	

	public WebElement username() {
		return username;

	}

	public WebElement password() {
		return password;

	}
	
	public WebElement login() {
		return login;

	}



}
