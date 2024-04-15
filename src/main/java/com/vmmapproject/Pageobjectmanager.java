package com.vmmapproject;

import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;
import com.utility.ConfigureReader;

public class Pageobjectmanager extends BaseClass {
public Pageobjectmanager()
{
	PageFactory.initElements(driver, this);
}
private LoginPage log;
private ForgetpasswordPage fog;
private RegisterPage reg;
private static Pageobjectmanager pom;
private ConfigureReader cog;
public RegisterPage getReg() {
	if(reg==null)
	{
		reg=new RegisterPage();
	}
	return reg;
}
public LoginPage getLog() {
	if(log==null) {
		log=new LoginPage();
	}
	return log;
}
public static Pageobjectmanager getPom() {
	if(pom==null)
	{
		pom=new Pageobjectmanager();
	}
	return pom;
}
public ConfigureReader getCog() {
	if(cog==null)
	{
		cog=new ConfigureReader();
	}
	return cog;
}
public ForgetpasswordPage getFog() {
	if(fog==null)
	{
		fog=new ForgetpasswordPage();
	}
	return fog;
}

}
