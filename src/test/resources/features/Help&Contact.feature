# new feature
# Tags: optional

Feature:  Open ebay.com
  As a client I want to open ebay.com
  and navigate to Help&Contact
  and open to information about account.

  Scenario: Open menu account and get title of the page.
    Given I am on the Home Page "https://www.ebay.com" of our site
    When I am open to Help&Contact
    And click on account button
    Then I should get title of the page"Account | eBay"
