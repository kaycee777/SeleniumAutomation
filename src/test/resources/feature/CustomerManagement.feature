


#
#Scenario: Account to be locked after maximum of 5 attempts of incorrect password
#Given User on log in page
#When User enters email address
#And User enters incorrect password after 5 times
#And User clicks on log in
#Then Account should be locked after maximum of 5 attempts of entering incorrect password
#
#Scenario: Forgotten password-Customer should use email address provided during account registration
#Given User on log in page
#When User clicks on forgot password link
#And User enters email address provided during registration
#And User log in to the email address to search for reset link
#And User enters new password
#Then New password should be updated successfully
#
#Scenario: View my order history-customer should have at least one order available
#Given User on log in page
#When User enters email address
#And User password
#And User clicks on log in
#And User account dashboard should be displayed
#And User clicks on my order
#Then One or more order should be displayed
#
#Scenario: Amend order-Dispatcth order cannot be amended
#Given User on log in page
#When User enters email address
#And User enters password
#And User clicks on log in
#And User account dashboard should be displayed
#And user clicks on amend order
#Then Dispatch order cannot be amended
#
#Scenario: Update customer details-update address and contact telephone
#Given User on log in page
#When User enters email address
#And User enters password
#And User clicks on log in
#And User account dashboard should be displayed
#And User clicks on update my details
#And User enters new address and new telephone number
#Then Address and teephone number should be changed successfully
#
#Scenario: Cancel order-Dispatch order cannot be cancel
#Given User on log in page
#When User enters email address
#And user enters password
#And User clicks on log in
#And User account dashboard should be displayed
#And User clicks on cancel order
#Then Dispatch order cannot be cancel
#
#Scenario: Abandoned Cart-Cart should abandoned after 2 hours of inactivity for Customer who is signed in
#Given User on log in page
#When User enters email address
#And User enters password
#And User clicks on log in
#And user dashboard should be displayed
#And User navigate to mens wear add some order to cart and leave the page for 2 hours of inactivity
#Then Customer cart is abandoned after 2 hours of inactivity while still signed in
#
#Scenario: Automatic sign out-Account is automatically signed out after 30 mins of inactivity
#Given User name on log in page
#When user enters email address
#And User enters password
#And User clicks on log in
#And user account dashboard should be displayed
#And leave the page for 30 minutes of inactivity
#Then customer Account is sign out automatically after 30 minutes of inactive on the website


