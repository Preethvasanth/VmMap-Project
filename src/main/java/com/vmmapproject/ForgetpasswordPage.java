package com.vmmapproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class ForgetpasswordPage extends BaseClass {
public ForgetpasswordPage()
{
	PageFactory.initElements(driver, this);;
}
@FindBy(xpath=Interfaceclass.Fo_signin_btn)
private WebElement Fo_signin_btn;
@FindBy(name=Interfaceclass.Fo_email_btn)
private WebElement Fo_email_btn;
@FindBy(xpath=Interfaceclass.Fo_forgetpassword)
private WebElement Fo_forgetpassword;
@FindBy(id=Interfaceclass.Fo_reset_password)
private WebElement Fo_reset_password;
@FindBy(xpath=Interfaceclass.change_btn)
private WebElement change_btn;
@FindBy(name=Interfaceclass.En_reset_password)
private WebElement En_reset_password;
@FindBy(id=Interfaceclass.En_Login_btn)
private WebElement En_Login_btn;
public WebElement getFo_signin_btn() {
	return Fo_signin_btn;
}
public WebElement getFo_email_btn() {
	return Fo_email_btn;
}
public WebElement getFo_forgetpassword() {
	return Fo_forgetpassword;
}
public WebElement getFo_reset_password() {
	return Fo_reset_password;
}
public WebElement getChange_btn() {
	return change_btn;
}
public WebElement getEn_reset_password() {
	return En_reset_password;
}
public WebElement getEn_Login_btn() {
	return En_Login_btn;
}

}
