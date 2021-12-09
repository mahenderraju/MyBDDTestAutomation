@Register
Feature: Register user in retailm1 upskill
  I want to register user in retailm1 upskill

  @RegisterUser
  Scenario: Register a user
    Given I am on retail upskill website
    When I enter firstname on register page
    | FirstName | FN2  |
    And enter lastname
    | LastName | LN2  |
    And enter email
    | Email | n2@gmail.com  |
    And enter mobilenumber
    | Mobile | 9876543216  |
    And enter addressOne
    | Address1 | Yeshwanthapur  |
    And enter addressTwo
    | Address2 | Bangalore  |
    And enter city
    | City | Bangalore  |
    And enter postcode
    | Postal Code | 560022  |
    And enter country
    | Country | India  |
    And enter region or state
    | State | Karnataka  |
    And enter password
    | Password | manzoor1  |
    And enter confirm password
    | ConfirmPassword | manzoor1  |
    And select radio button to subscribe
    And select checkbox to agree terms and privacy policy
    And click Continue
    Then User is registered successfully
    
  @LoginUser
  Scenario: Login to my account
    Given I am on retail upskill website
    When I enter userid and password
      | Userid | n2@gmail.com |
      | Password   | manzoor1  |
    Then User is logged in successfully