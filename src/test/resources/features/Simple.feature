@ignore﻿
Feature: Compute
  In order to use Appium in my project, I want to compute expressions
 
  Scenario Outline: Compute button check
    Given I am on the app homepage
    When I enter <firstNumber> in the first editbox
    And I enter <secondNumber> in the second editbox and click Compute button
    Then I should see <result> in the "Answer" element
  Examples:
  | firstNumber | secondNumber | result |
  | 10          | 20           |   30   |
  | -50         | 40           |   10   |
  | 10          | 38           |   50   |     