Feature: Login
  In order to use Belwether app, I want to login to the app
  
Scenario Outline: Login with valid credentials
    Given I am on the Login page
    When I enter <username> in the username editbox
    And I enter <password> in the password editbox and click login button
    Then I should see Dashboard page
Examples:
  | username    | password     | 
  | bw1@bw.com  | bw11         | 
  | bw2@bw.com  | bw22         |  
  @new_feature
Scenario Outline: Login with invalid credentials
    Given I am on the Login page  
    When I enter <username> in the username editbox
    And I enter <password> in the password editbox and click login button
    Then I should see Login page and error message
Examples:
  | username      | password     | 
  | bw1@bw.com    | ''           | 
  | ''            | bw22         | 
  | bw2@bw.com    | bw223        | 
  | bw2 @bw.com   | bw22         |  