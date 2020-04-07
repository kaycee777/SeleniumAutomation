$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@accountManagement"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Account login-Registered Customer",
  "description": "",
  "id": "login;account-login-registered-customer",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User on log in page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User their enters email Address",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User their enters password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks on log in",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "my account dashboard is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.userOnLogInPage()"
});
formatter.result({
  "duration": 28626040000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userTheirEntersEmailAddress()"
});
formatter.result({
  "duration": 2822451100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userTheirEntersPassword()"
});
formatter.result({
  "duration": 921205900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userClicksOnLogIn()"
});
formatter.result({
  "duration": 3152419900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.myAccountDashboardIsDisplayed()"
});
formatter.result({
  "duration": 4585586800,
  "status": "passed"
});
});