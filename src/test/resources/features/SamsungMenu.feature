# new feature
# Tags: optional
@samsung_Menu
Feature: Open ebay.com
  As a client I want to open ebay.com
  and navigate to Electronics menu
  and open Camera Drones menu option

  Scenario: Open menu option Camera Drones by howering mouse on Electronics menu
    Given I am on the Home Page "https://www.ebay.com" of our site
    When I move to the menu
      | Menu          |
      | Electronics   |
      | Fashion       |
    And I am click to samsung Menu
    And I am click to See All