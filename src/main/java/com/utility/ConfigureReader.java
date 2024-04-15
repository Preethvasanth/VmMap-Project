package com.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class ConfigureReader extends BaseClass {
	public ConfigureReader()
	{
		PageFactory.initElements(driver, this);
	}
	private String Browser=PropertyFile.getAPropertyFiles().getProperty("Browser");
	private String ApplicationUrl =PropertyFile.getAPropertyFiles().getProperty("ApplicationUrl");
private String Fullname=PropertyFile.getAPropertyFiles().getProperty("Fullname");
private String Emailaddress=PropertyFile.getAPropertyFiles().getProperty("Emailaddress");
private String Mobileno=PropertyFile.getAPropertyFiles().getProperty("Mobileno");
private String password=PropertyFile.getAPropertyFiles().getProperty("password");
private String confirmpassword=PropertyFile.getAPropertyFiles().getProperty("confirmpassword");
private String EnterOTP=PropertyFile.getAPropertyFiles().getProperty("EnterOTP");
private String Lo_Email=PropertyFile.getAPropertyFiles().getProperty("Lo_Email");
private String Lo_password=PropertyFile.getAPropertyFiles().getProperty("Lo_password"); 
private String Fo_email_btn=PropertyFile.getAPropertyFiles().getProperty("Fo_email_btn");
//private String enter_OTP=PropertyFile.getAPropertyFiles().getProperty("enter_OTP");
private String Fo_reset_password=PropertyFile.getAPropertyFiles().getProperty("Fo_reset_password");
private String En_reset_password=PropertyFile.getAPropertyFiles().getProperty("En_reset_password");
public String getBrowser() {
	return Browser;
}
public String getApplicationUrl() {
	return ApplicationUrl;
}
public String getFullname() {
	return Fullname;
}
public String getEmailaddress() {
	return Emailaddress;
}

public String getMobileno() {
	return Mobileno;
}
public String getPassword() {
	return password;
}
public String getConfirmpassword() {
	return confirmpassword;
}
public String getEnterOTP() {
	return EnterOTP;
}
public String getLo_Email() {
	return Lo_Email;
}
public String getLo_password() {
	return Lo_password;
}
public String getFo_email_btn() {
	return Fo_email_btn;
}
public String getFo_reset_password() {
	return Fo_reset_password;
}
public String getEn_reset_password() {
	return En_reset_password;
}
public static void takeScreenshot() {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("Screenshot.png");

	try {
		FileHandler.copy(src, dest);
	} catch (IOException e) {

		e.printStackTrace();
	}
}

}
