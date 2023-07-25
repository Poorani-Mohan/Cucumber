@loginTest
Feature: Validation Login Functionality

Scenario Outline: Test Successful login case
Given User is on the login screen
When User provides correct username
|user123|
#And User provides correct password=<password>
#Then User must login
#But error should not be there

#Examples:
#|username|password|
#|user@123|pass@123|
#|user@456|pass@456|
#|user@789|pass@789|