
Feature: This is the vmmap appliction used to verify the login process

  Background: 
    Given User launch the browser
    When User can navigate the vmmap apllication URL

  Scenario: This is the registration process for new user
    Given New user click the signup button
    When User can enter the FullName
    Then User can enter the Emailaddress
    Then User can enter the Mobile_No
    Then User can enter the Password
    Then User can enter the confirmpassword
    And User can agree the privacy policy and terms and conditions
    Then Mark the signup option
    Then user can clicks the Register button
    And enter OTP number
    Then user can verify the otp
    Then New user should be register successfully.
   
    
