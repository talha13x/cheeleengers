@UserRegisteration
Feature: user registration
Scenario Outline: register a valid user
 Given i am an neeww tours homepage
 When I click on the register link
 And I enter "<first name>" "<last name>""<phone number>""<email>" "<user name>" "<password>"
And I click on submit button
Then I receive confirmation page and massage
Examples:
|fairst name| |last name|  |email| |user name| |password| |confirm password|
|talha| |bakth| |646-623-8356| |talha13x@yahoo.com| |talha| |pasword1||password1|



