$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("web/gureTest1.feature");
formatter.feature({
  "line": 1,
  "name": "User select mobile and check it is in cart",
  "description": "",
  "id": "user-select-mobile-and-check-it-is-in-cart",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8355032300,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "verify selected mobile are sorted by name",
  "description": "",
  "id": "user-select-mobile-and-check-it-is-in-cart;verify-selected-mobile-are-sorted-by-name",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@guru1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I go to Home Page url as \"http://live.demoguru99.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I Verify Title of the page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I Click on �MOBILE� menu",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I  Verify the  Title of the page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "In the list of all mobile",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I select �SORT BY� dropdown as �name�",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I Verify all products are sorted by name",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://live.demoguru99.com/",
      "offset": 26
    }
  ],
  "location": "getaQuote_sd.iGoToHomePageUrlAs(String)"
});
formatter.result({
  "duration": 140259400,
  "status": "passed"
});
formatter.match({
  "location": "guruTest1_sd.iVerifyTitleOfThePage()"
});
formatter.result({
  "duration": 9400300,
  "status": "passed"
});
formatter.match({
  "location": "guruTest1_sd.iClickOnMOBILEMenu()"
});
formatter.result({
  "duration": 1333843700,
  "status": "passed"
});
formatter.match({
  "location": "guruTest1_sd.iVerifyTheTitleOfThePage()"
});
formatter.result({
  "duration": 4530500,
  "status": "passed"
});
formatter.match({
  "location": "guruTest1_sd.inTheListOfAllMobile()"
});
formatter.result({
  "duration": 37879700,
  "status": "passed"
});
formatter.match({
  "location": "guruTest1_sd.iSelectSORTBYDropdownAsName()"
});
formatter.result({
  "duration": 504017500,
  "status": "passed"
});
formatter.match({
  "location": "guruTest1_sd.iVerifyAllProductsAreSortedByName()"
});
formatter.result({
  "duration": 463032000,
  "status": "passed"
});
formatter.after({
  "duration": 98900,
  "status": "passed"
});
});