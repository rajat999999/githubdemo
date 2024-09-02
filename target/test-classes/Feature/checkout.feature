Feature: Search and Chekout the Product

@checkout
Scenario: Search the product and checkout the order

Given User is on Home page 
When User serched with shortname "Tom" and extracted name 
And User add the same prodcut on landing page "3" times
And User the checkout the product 
And Validate the productname in checkoutpage matches with Landing page product "Tom"
And Validate the productqty in checkoutpage matches with "3" 
Then Validate Enter Promo code accessbility and Palce the order 


#Given  User is on Home page
#When   User serched with shortname "Cuc" and extracted name 
#And  User searched the same prodcut "Cuc" in Offer page
#Then  Validate the productname in offer page matches with Landing page productname


