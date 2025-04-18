package org.reg;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationClass extends BaseClass {
	
	public RegistrationClass() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//a[text()='New User Register Here']")
private WebElement register;


@FindBy(xpath="//input[@name='username']")
private WebElement username;


@FindBy(xpath="//input[@name='password']")
private WebElement password;


@FindBy(xpath="//input[@name='re_password']")
private WebElement repassword;



@FindBy(xpath="//input[@name='full_name']")
private WebElement fullname;



@FindBy(xpath="//input[@name='email_add']")
private WebElement email;



@FindBy(xpath="//input[@name='captcha']")
private WebElement captcha;


@FindBy(xpath="//input[@type='checkbox']")
private WebElement checkbox;

@FindBy(xpath="//input[@type='submit']")
private WebElement submit;

@FindBy(id="username_span")
private WebElement userspan;





public WebElement register() {
	return register;

}

public WebElement username() {
	return username;

}

public WebElement password() {
	return password;

}

public WebElement repassword() {
	return repassword;

}

public WebElement fullname() {
	return fullname;

}

public WebElement email() {
	return email;

}

public WebElement captcha() {
	return captcha;

}

public WebElement checkbox() {
	return checkbox;

}

public WebElement submit() {
	return submit;

}

public WebElement userspan() {
	return userspan;

}
}
