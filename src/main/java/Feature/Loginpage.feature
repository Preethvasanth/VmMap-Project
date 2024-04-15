Feature: This is the vmmap appliction used to verify the login process

  Background: 
    Given User launch the browser
    When User can navigate the vmmap apllication URL

  Scenario: This is the login process for existing user
    Given user clicks the signin button
    When user can enter the Emailaddress1
    Then user can enter the Password1
    Then user clicks the login button
    Then user should be logged successfuly

  Scenario: This is the forget password processs for existing user
    Given User can click the SighIn button
    When User can enter the Email_address
    Then User clicks the forgetpassword button
    Then User can enter the Login password
    Then user clicks the change button
    Then user can enter the new password
    Then user clicks the Login_button1
