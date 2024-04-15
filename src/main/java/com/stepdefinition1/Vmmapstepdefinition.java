package com.stepdefinition1;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Base.BaseClass;
import com.utility.ConfigureReader;
import com.vmmapproject.Pageobjectmanager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Vmmapstepdefinition extends BaseClass{
	 static Pageobjectmanager pom =Pageobjectmanager.getPom();
	 private static final Logger LOGGER=LogManager.getLogger(Vmmapstepdefinition.class);
	@Given("User launch the browser")
	public void user_launch_the_browser() {
	   browserLaunch(pom.getCog().getBrowser());
	}

	@When("User can navigate the vmmap apllication URL")
	public void user_can_navigate_the_vmmap_apllication_url() {
		launchUrl(pom.getCog().getApplicationUrl());
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    }
	//Registration
	@Given("New user click the signup button")
	public void new_user_click_the_signup_button() {
		try {
		elementClick(pom.getReg().getRe_SignUp_btn());
		}catch(Exception e) {
			LOGGER.error(e);
			pom.getCog();
			ConfigureReader.takeScreenshot();
		}
	   }
	@When("User can enter the FullName")
	public void user_can_enter_the_full_name() {
		try {
		Input(pom.getReg().getRe_Fullname_btn(),pom.getCog().getFullname());
	}catch(Exception e) {
		LOGGER.error(e);
		pom.getCog();
		ConfigureReader.takeScreenshot();
	}
	}
	@Then("User can enter the Emailaddress")
	public void user_can_enter_the_emailaddress() {
		try {
		Input(pom.getReg().getRe_Email_btn(),pom.getCog().getEmailaddress());
		}catch(Exception e) {
			LOGGER.error(e);
			pom.getCog();
			ConfigureReader.takeScreenshot();
		}
	   }
	@Then("User can enter the Mobile_No")
	public void user_can_enter_the_mobile_no() {
		try {
		Input(pom.getReg().getRe_Mobile_btn(),pom.getCog().getMobileno());
		}catch(Exception e) {
			LOGGER.error(e);
			pom.getCog();
			ConfigureReader.takeScreenshot();
		}
	}
	@Then("User can enter the Password")
	public void user_can_enter_the_password() {
		try {
		Input(pom.getReg().getRe_password_btn(),pom.getCog().getPassword());
		}catch(Exception e) {
			LOGGER.error(e);
			pom.getCog();
			ConfigureReader.takeScreenshot();
		}
	    }
	@Then("User can enter the confirmpassword")
	public void user_can_enter_the_confirmpassword() {
		try {
	  Input(pom.getReg().getRe_confirmpassword_btn(),pom.getCog().getConfirmpassword()); 
		}catch(Exception e) {
			LOGGER.error(e);
			pom.getCog();
			ConfigureReader.takeScreenshot();
		}
	}
	@Then("User can agree the privacy policy and terms and conditions")
	public void user_can_agree_the_privacy_policy_and_terms_and_conditions() {
		try {
	   elementClick(pom.getReg().getTerms_btn());
		}catch(Exception e) {
			LOGGER.error(e);
			pom.getCog();
			ConfigureReader.takeScreenshot();
		}
	}
	@Then("Mark the signup option")
	public void mark_the_signup_option() {
		try {
		elementClick(pom.getReg().getNewslettr_btn());
		}catch(Exception e) {
			LOGGER.error(e);
			pom.getCog();
			ConfigureReader.takeScreenshot();
		}
	    }
	@Then("user can clicks the Register button")
	public void user_can_clicks_the_register_button() {
		try {
		elementClick(pom.getReg().getRegister_btn());
		}catch(Exception e) {
			LOGGER.error(e);
			pom.getCog();
			ConfigureReader.takeScreenshot();
		}
	    }
@Then("enter OTP number")
public void enter_otp_number() {
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	Input(pom.getReg().getOTP_btn(),pom.getCog().getEnterOTP());
	    
	}
@Then("user can verify the otp")
public void user_can_verify_the_otp() {
	try {
	    elementClick(pom.getReg().getVerify_btn());
	}catch(Exception e) {
		LOGGER.error(e);
		pom.getCog();
		ConfigureReader.takeScreenshot();
	}
	}
@Then("New user should be register successfully.")
public void new_user_should_be_register_successfully() {
	try {
	    LOGGER.info("Account created successfully");
	}catch(Exception e) {
		LOGGER.error(e);
		pom.getCog();
		ConfigureReader.takeScreenshot();
	}
	  close();  
	}
// LoginPage
@Given("user clicks the signin button")
public void user_clicks_the_signin_button() {
    elementClick(pom.getLog().getLo_sign_btn());
}
@When("user can enter the Emailaddress1")
public void user_can_enter_the_emailaddress1() {
	Input(pom.getLog().getLo_Email_btn(),pom.getCog().getLo_Email());
    }
@Then("user can enter the Password1")
public void user_can_enter_the_password1() { 
	Input(pom.getLog().getLo_password_btn(),pom.getCog().getLo_password());
    }
@Then("user clicks the login button")
public void user_clicks_the_login_button() {
	elementClick(pom.getLog().getLo_Login_btn());
    }
@Then("user should be logged successfuly")
public void user_should_be_logged_successfuly() {

   System.out.println("user should be logged successfuly"); 
		pom.getCog();
		ConfigureReader.takeScreenshot();
   close();
}

//Forgetpassword
@Given("User can click the SighIn button")
public void user_can_click_the_sigh_in_button() {
  elementClick(pom.getFog().getFo_signin_btn());  
}

@When("User can enter the Email_address")
public void user_can_enter_the_email_address() {
	Input(pom.getFog().getFo_email_btn(),pom.getCog().getFo_email_btn());
   }
@Then("User clicks the forgetpassword button")
public void user_clicks_the_forgetpassword_button() {
    elementClick(pom.getFog().getFo_forgetpassword());
}

@Then("User can enter the Login password")
public void user_can_enter_the_login_password() {
	elementClick(pom.getFog().getFo_reset_password());
	try {
		Thread.sleep(25000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Input(pom.getFog().getFo_reset_password(),pom.getCog().getFo_reset_password());
  }
@Then("user clicks the change button")
public void user_clicks_the_change_button() {
	elementClick(pom.getFog().getChange_btn());
	pom.getCog();
	ConfigureReader.takeScreenshot(); 
}
@Then("user can enter the new password")
public void user_can_enter_the_new_password() {
	Input(pom.getFog().getEn_reset_password(),pom.getCog().getEn_reset_password());
    try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
@Then("user clicks the Login_button1")
public void user_clicks_the_login_button1() {
	elementClick(pom.getFog().getEn_Login_btn());
	LOGGER.info("Login successful");
	pom.getCog();
	ConfigureReader.takeScreenshot();
	quit();
    
}

}









