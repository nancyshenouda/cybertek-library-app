Feature:
  Agile story: Smart bear login and order task
  TC#SB3: SmartBear order process
@wip
  Scenario: SmartBear order process
  Given User is logged into SmartBear Tester account and on Order page
  When User enters "Tester" in the username field
  And User enters "test" in the password field
  Then User clicks on login button
  When User fills out the form as followed:
  And User selects "FamilyAlbum" from product dropdown
  And User enters "4" to quantity
  And User enters "John Wick" to costumer name
  And User enters "Kinzie Ave" to street
  And User enters "Chicago" to city
  And User enters "IL" to state
  And User enters "60056" to zip code
  And User selects "Visa" as card type
  And User enters "1111222233334444" to card number
  And User enters "12/22" to expiration date
  And User clicks process button
  Then User verifies "John Wick" is in the list