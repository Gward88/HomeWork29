$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchItem.feature");
formatter.feature({
  "comments": [
    {
      "line": 2,
      "value": "# here is a comments"
    },
    {
      "line": 3,
      "value": "#below is a tag for identifying of specific tests"
    }
  ],
  "line": 5,
  "name": "Open ebay.com",
  "description": "As a client I want to open ebay.com\r\nand navigate to Electronics menu\r\nand open Camera Drones menu option",
  "id": "open-ebay.com",
  "keyword": "Feature",
  "tags": [
    {
      "line": 4,
      "name": "@first-TestCase"
    }
  ]
});
formatter.before({
  "duration": 4056626238,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Open menu option Camera Drones by howering mouse on Electronics menu",
  "description": "",
  "id": "open-ebay.com;open-menu-option-camera-drones-by-howering-mouse-on-electronics-menu",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I am on the Home Page \"https://www.ebay.com\" of our site",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I move to the menu",
  "rows": [
    {
      "cells": [
        "Menu"
      ],
      "line": 13
    },
    {
      "cells": [
        "Electronics"
      ],
      "line": 14
    },
    {
      "cells": [
        "Fashion"
      ],
      "line": 15
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "click on \"Camera Drones\" link",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user clicks on \"Advanced\" link",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should get title of the page \"eBay Search: Advanced Search\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.ebay.com",
      "offset": 23
    }
  ],
  "location": "SearchItemSteps.i_am_on_the_Home_Page_of_our_site(String)"
});
formatter.result({
  "duration": 2182692252,
  "status": "passed"
});
formatter.match({
  "location": "SearchItemSteps.i_move_to_the_menu(String\u003e)"
});
formatter.result({
  "duration": 224855694,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Camera Drones",
      "offset": 10
    }
  ],
  "location": "SearchItemSteps.click_on_link(String)"
});
formatter.result({
  "duration": 2247560582,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Advanced",
      "offset": 16
    }
  ],
  "location": "SearchItemSteps.userClicksOnLink(String)"
});
formatter.result({
  "duration": 1185091644,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "eBay Search: Advanced Search",
      "offset": 32
    }
  ],
  "location": "SearchItemSteps.iShouldGetTitleOfThePage(String)"
});
formatter.result({
  "duration": 7596357,
  "status": "passed"
});
formatter.after({
  "duration": 231417983,
  "status": "passed"
});
});