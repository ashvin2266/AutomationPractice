$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("web/alreadyRegistered.feature");
formatter.feature({
  "line": 2,
  "name": "Already Registered",
  "description": "",
  "id": "already-registered",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@already"
    }
  ]
});
formatter.before({
  "duration": 10474181300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "I enter a valid detail",
  "description": "",
  "id": "already-registered;i-enter-a-valid-detail",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@already1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I go to Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on a sign in button on home page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see Already Registered in authentication page title as\"Login - My Store\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I enter a valid email as \"abg@hotmail.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter a valid password as \"123abc\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should see my account page Url as\"http://automationpractice.com/index.php?controller\u003dmy-account\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "verify the page title of account page is \"My account - My Store\"",
  "keyword": "And "
});
formatter.match({
  "location": "alreadyRegistered_sd.iGoToHomePage()"
});
formatter.result({
  "duration": 132985900,
  "status": "passed"
});
formatter.match({
  "location": "alreadyRegistered_sd.iClickOnASignInButtonOnHomePage()"
});
formatter.result({
  "duration": 1698111600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login - My Store",
      "offset": 64
    }
  ],
  "location": "alreadyRegistered_sd.iShouldSeeAlreadyRegisteredInAuthenticationPageTitleAs(String)"
});
formatter.result({
  "duration": 8983100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abg@hotmail.com",
      "offset": 26
    }
  ],
  "location": "alreadyRegistered_sd.iEnterAValidEmailAs(String)"
});
formatter.result({
  "duration": 85906800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123abc",
      "offset": 29
    }
  ],
  "location": "createAnAccount_sd.iEnterAValidPasswordAs(String)"
});
formatter.result({
  "duration": 76625100,
  "status": "passed"
});
formatter.match({
  "location": "alreadyRegistered_sd.iClickOnSignInButton()"
});
formatter.result({
  "duration": 1436653300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/index.php?controller\u003dmy-account",
      "offset": 36
    }
  ],
  "location": "alreadyRegistered_sd.iShouldSeeMyAccountPageUrlAs(String)"
});
formatter.result({
  "duration": 5411700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My account - My Store",
      "offset": 42
    }
  ],
  "location": "alreadyRegistered_sd.verifyThePageTitleOfAccountPageIs(String)"
});
formatter.result({
  "duration": 8456800,
  "status": "passed"
});
formatter.after({
  "duration": 56322900,
  "status": "passed"
});
});