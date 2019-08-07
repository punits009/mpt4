Feature: User Detail Validation


Scenario: Invalid title
Given User on User Detail Page
When User Detail Page 'title is invalid'
Then Show 'invalid detail Page Title'

Scenario: Invalid Applicant Name
Given User on User Detail Page
When User enters 'invalid applicant name'
Then Show 'invalid applicant name'

Scenario: Invalid first Name
Given User on User Detail Page
When User enters 'invalid first name'
Then Show 'invalid first name'

Scenario: Invalid Last Name
Given User on User Detail Page
When User enters 'invalid Last name'
Then Show 'invalid Last name'

Scenario: Invalid Father Name
Given User on User Detail Page
When User enters 'invalid father name'
Then Show 'invalid father name'

Scenario: Invalid Date Of birth
Given User on User Detail Page
When User enters 'invalid DOB'
Then Show 'invalid DOB'

Scenario: Invalid Gender
Given User on User Detail Page
When User enters 'invalid Gender'
Then Show 'invalid Gender'

Scenario: Invalid mobileno
Given User on User Detail Page
When User enters 'invalid mobileno'
Then Show 'invalid mobileno'

Scenario: Invalid MailId
Given User on User Detail Page
When User enters 'invalid MailId'
Then Show 'invalid MailID'

Scenario: Invalid Landline
Given User on User Detail Page
When User enters 'invalid landline'
Then Show 'invalid landline'

Scenario: Invalid Communication
Given User on User Detail Page
When User enters 'invalid communication'
Then Show 'invalid communication'

Scenario: Sumit Form
Given User is on User Registration Page
When User clicks on Submit button with valid inputs
Then Redirected to Payment Page 
