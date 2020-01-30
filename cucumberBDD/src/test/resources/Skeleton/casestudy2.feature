Feature: TestMe App Login feature file


Scenario Outline: Credentials to Login to TestMe App
Given The URL of the TestMe App "http://10.232.237.143:443/TestMeApp/fetchcat.htm"
When User clicks on SignIn
And User enters "<Username>" as Username
And  User enters "<PassWord>" as PassWord
Then User clicks on Login


 Examples:
 | Username         | PassWord |
 | Sowjisow         | ABCde    |