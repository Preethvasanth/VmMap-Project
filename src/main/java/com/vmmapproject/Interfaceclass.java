package com.vmmapproject;

public interface Interfaceclass {
	//Registration
	static String Re_SignUp_btn="signupToggle";//id
	String Re_Fullname_btn="signup-username";//id
	String Re_Email_btn="signup-email";//id
	String Re_Mobile_btn="signup-mobile";//id
	String Re_password_btn="signup-password";//id
	String Re_confirmpassword_btn="signup-confirmPassword";
	String Terms_btn="terms-vms-policy";
	String newslettr_btn="newsLetter";
	String Register_btn="signup-submit-text";
	String OTP_btn="otp";
	String Verify_btn="verify-otp-text";
	//Loginpage
	String Lo_sign_btn="//span[normalize-space(text())='Sign In']";//xpath
	String Lo_Email_btn="email"; //name
	String Lo_password_btn="pswd"; //name
	String Lo_Login_btn="login-submit-text"; //id
	
	//Forgetpassword
	
	String Fo_signin_btn="//span[normalize-space(text())='Sign In']";//xpath
	String Fo_email_btn="email";//name
	String Fo_forgetpassword="//span[normalize-space(text())='Forgot Password?']";	//xpath
	//String enter_OTP="Resetotp";// id
	String Fo_reset_password="Resetpassword"; //id
	String change_btn="//span[normalize-space(text())='Change']";
	String En_reset_password="pswd";//name
	String En_Login_btn="login-submit-text"; //id
	
	

}
