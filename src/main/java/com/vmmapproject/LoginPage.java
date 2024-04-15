package com.vmmapproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=Interfaceclass.Lo_sign_btn)
	private WebElement Lo_sign_btn;
@FindBy(name=Interfaceclass.Lo_Email_btn)
private WebElement Lo_Email_btn;
@FindBy(name=Interfaceclass.Lo_password_btn)
private WebElement Lo_password_btn;
@FindBy(id=Interfaceclass.Lo_Login_btn)
private WebElement Lo_Login_btn;

public WebElement getLo_sign_btn() {
	return Lo_sign_btn;
}
public WebElement getLo_Email_btn() {
	return Lo_Email_btn;
}
public WebElement getLo_password_btn() {
	return Lo_password_btn;
}
public WebElement getLo_Login_btn() {
	return Lo_Login_btn;
}

}
