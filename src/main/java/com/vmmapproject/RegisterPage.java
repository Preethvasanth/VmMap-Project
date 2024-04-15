package com.vmmapproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class RegisterPage extends BaseClass {
public RegisterPage()
{
	PageFactory.initElements(driver, this);
}
@FindBy(id=Interfaceclass.Re_SignUp_btn)
private WebElement Re_SignUp_btn;
@FindBy(id=Interfaceclass.Re_Fullname_btn)
private WebElement Re_Fullname_btn;
@FindBy(id=Interfaceclass.Re_Email_btn)
private WebElement Re_Email_btn;
@FindBy(id=Interfaceclass.Re_Mobile_btn)
private WebElement Re_Mobile_btn;
@FindBy(id=Interfaceclass.Re_password_btn)
private WebElement Re_password_btn ;
@FindBy(id=Interfaceclass.Re_confirmpassword_btn)
private WebElement Re_confirmpassword_btn;
@FindBy(id=Interfaceclass.Terms_btn)
private WebElement Terms_btn;
@FindBy(id=Interfaceclass.newslettr_btn)
private WebElement  newslettr_btn;
@FindBy(id=Interfaceclass.Register_btn)
private WebElement Register_btn ;
@FindBy(id=Interfaceclass.OTP_btn)
private WebElement OTP_btn ;
@FindBy(id=Interfaceclass.Verify_btn)
private WebElement Verify_btn ;
public WebElement getRe_SignUp_btn() {
	return Re_SignUp_btn;
}
public WebElement getRe_Fullname_btn() {
	return Re_Fullname_btn;
}
public WebElement getRe_Email_btn() {
	return Re_Email_btn;
}
public WebElement getRe_Mobile_btn() {
	return Re_Mobile_btn;
}
public WebElement getRe_password_btn() {
	return Re_password_btn;
}
public WebElement getRe_confirmpassword_btn() {
	return Re_confirmpassword_btn;
}
public WebElement getTerms_btn() {
	return Terms_btn;
}
public WebElement getNewslettr_btn() {
	return newslettr_btn;
}
public WebElement getRegister_btn() {
	return Register_btn;
	
}
public WebElement getOTP_btn() {
	return OTP_btn;
}
public WebElement getVerify_btn() {
	return Verify_btn;
}

}

