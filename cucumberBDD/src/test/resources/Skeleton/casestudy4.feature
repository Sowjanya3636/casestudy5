Feature: Pyement gateway in TestMe app
Scenario: Credentials to Login to TestMe App
Given The URL of the TestMe App "http://10.232.237.143:443/TestMeApp/fetchcat.htm"
When User clicks on SignIn
And User enters "<Username>" as Username
And  User enters "<PassWord>" as PassWord
And User clicks on Login
And User searches for product "<product>" 
And User clicks on FINDETAILS
And User tries to proceed to payement without adding any item in the cart
Then TestMe app doesn't display the cart icon