Feature:  Testing of multiupload
  Scenario: MultiUpload

    Given User opens Chrome browse and move to multiupload page
    When User makes "multi-upload"
    Then User will be moved on multi upload configurator page
    And  User clicks  "clickButton"
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
