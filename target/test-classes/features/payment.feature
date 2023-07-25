Feature: Validating payment functionality
@tag1 @tag3
Scenario: Gpay integration is selected
Given user already has an account on Gpay
When userid is correct
Then Gpay message should be sent

@tag1
Scenario: PhonePe integration is selected
Given user already has an account on PhonePe
When userid is correct
Then PhonePe message should be sent