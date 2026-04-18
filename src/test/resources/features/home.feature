@all
Feature: Home

  @first
  Scenario: Open home page
    Given start browser in home
    Then i must see the home page

  @contact
  Scenario: Validate contact window
    Given start browser in home
    When i click on "contact" in home
    Then i must see the contact window

