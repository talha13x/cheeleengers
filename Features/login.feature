@login
Feature: login to flights
Scenario Outline: login a valid user
Given i am on the flights homepage
When i nenter "<user name>"," <password>"
And i click sign in button
Then i am on the flight reservation page

Examples:
|user name|
|password|
|guest|
|guest|