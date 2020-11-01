$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("web/gureTest1.feature");
formatter.feature({
  "line": 1,
  "name": "User select mobile and check it is in cart",
  "description": "",
  "id": "user-select-mobile-and-check-it-is-in-cart",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10550516400,
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
  "duration": 136383000,
  "status": "passed"
});
formatter.match({
  "location": "guruTest1_sd.iVerifyTitleOfThePage()"
});
formatter.result({
  "duration": 8058400,
  "status": "passed"
});
formatter.match({
  "location": "guruTest1_sd.iClickOnMOBILEMenu()"
});
formatter.result({
  "duration": 1224686500,
  "status": "passed"
});
formatter.match({
  "location": "guruTest1_sd.iVerifyTheTitleOfThePage()"
});
formatter.result({
  "duration": 4034800,
  "status": "passed"
});
formatter.match({
  "location": "guruTest1_sd.inTheListOfAllMobile()"
});
formatter.result({
  "duration": 31052800,
  "status": "passed"
});
formatter.match({
  "location": "guruTest1_sd.iSelectSORTBYDropdownAsName()"
});
formatter.result({
  "duration": 77190900,
  "status": "passed"
});
formatter.match({
  "location": "guruTest1_sd.iVerifyAllProductsAreSortedByName()"
});
formatter.result({
  "duration": 53378500,
  "error_message": "java.lang.AssertionError: expected:\u003c[IPHONE, SAMSUNG GALAXY, SONY XPERIA]\u003e but was:\u003c[SONY XPERIA, IPHONE, SAMSUNG GALAXY]\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:118)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.stepDefination.web_sd.guruTest1_sd.iVerifyAllProductsAreSortedByName(guruTest1_sd.java:70)\r\n\tat ✽.Then I Verify all products are sorted by name(web/gureTest1.feature:10)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 462093600,
  "status": "passed"
});
});