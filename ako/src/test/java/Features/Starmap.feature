Feature: Starmap product

  Scenario: User is available to choose product Starmap

    Given User opens Chrome browser and move to the Starmap page of shop meinfoto
    When User click on "upload button" from Starmap teaser
    Then User should move on configurator page with uploaded image
    And  User is available to choose needed "button" on StarMap configurator
    And  User is available to choose "quantity"
    And  User on cart page check that selected product is displayed correctly
    And  User click on "CTA button" and move on orderaddress page
    And  User fill all "required fields" from delivery table
    And  User click on CTA button and move on  payment page
    And  User select "Credit Card" payment method
    And  User fill all "required fields" from credit card payment table
    And  User click on "CTA button" and move on confirmorder page
    And  User check that selected product is displayed correctly
    And  User click on "CTA button"
    Then User will be redirected on ordersuccessfully page and "check" tracking order
