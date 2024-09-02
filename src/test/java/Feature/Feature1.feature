Feature: Search and Place the Product
@landing
Scenario: Search the product and place the order in home page and offer page

Given  User is on Home page
When   User serched with shortname "Str" and extracted name 
And  User searched the same prodcut "Str" in Offer page
Then  Validate the productname in offer page matches with Landing page productname
#And Close Browser



#Scenario Outline: Search the product and place the order in home page and offer page using different datasets
#
#Given  User is on Home page outline
#When   User serched with shortname <Name> and extracted names 
#And  User searched the same prodcut <Name> in Offer pages
#Then  Validate the productnames in offer page matches with Landing page productname
 #
#Examples:
#|Name|
#|Tom|
#|Cauli|
