Feature: Payment Detail Feature

Scenario: Invalid Card Holder Name
Given User on Payment Detail Page
When User enters 'invalid Card Holder Name'
Then Show 'invalid  Card Holder Name'

Scenario: Invalid Debit Card Number
Given User on Payment Detail Page
When User enters 'invalid Debit Card Number'
Then Show 'invalid  Debit Card Number'

Scenario: Invalid Card Expiration Month
Given User on Payment Detail Page
When User enters 'invalid Card Expiration Month'
Then Show 'invalid  Card Expiration Month'

Scenario: Invalid Card Expiration year
Given User on Payment Detail Page
When User enters 'invalid Card Expiration year'
Then Show 'invalid  Card Expiration year'


Scenario: Submit Form
Given  User on Payment Detail Page
When User clicks on Make Payment button with valid inputs
Then Redirected to Success Page 
