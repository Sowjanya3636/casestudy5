Feature: TestMe App Register feature file
Scenario: Credentials to register into the Admin user
Given The URL of the TestME App "http://10.232.237.143:443/TestMeApp/fetchcat.htm"
When User clicks on SignUp 
And User enters "<user_name>" as user_name
And User enters "<firstname>" as firstname
And User enters "<lastname>" as lastname
And User enters "<Password>" as Password
And User enters "<confirmpassword>" as confirmpassword
And User enters "<Gender>" as gender
And User enters "<Email>" as email
And User enters "<MobileNumber>" as MobileNumber
And User enters "<dob>" as dob
And User enters "<Address>" as address
And User enters "<Securityquestion>" as securityquestion
And User enters "<Answer>" as Answer
Then User clicks on Register 


Scenario Outline: Credentials to Login to TestMe App
Given The URL of the TestMe App "http://10.232.237.143:443/TestMeApp/fetchcat.htm"
When User clicks on SignIn
And User enters "<Username>" as Username
And  User enters "<PassWord>" as PassWord
And User clicks on Login
And User searches for product "<product>"
And User clicks on FINDETAILS
Then User clicks on ADDTOCART



 Examples:
 | Username         | PassWord |
 | Sowjisow         | ABCde    |
