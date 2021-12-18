Feature: n11 login
#https://so.n11.com/
@selleroffice-signup
Scenario: n11 selleroffice login
Given user launch browser and open the login page
When user signed in selleroffice with valid credentials
Then user signed in selleroffice successfully
