$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("scenarios.feature");
formatter.feature({
  "line": 1,
  "name": "City National Bank scenarios",
  "description": "Description: The purpose of this feature is to test End 2 End integration.",
  "id": "city-national-bank-scenarios",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Customer validates login information for different suites",
  "description": "",
  "id": "city-national-bank-scenarios;customer-validates-login-information-for-different-suites",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "he taps on signIn page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "choose to login City National Online",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "validates City National Online login information",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "moves to Business Suite",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "choose to login into Business Suite",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "validates Business Suite login information",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "moves to Business Essentials",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "choose to login into Business Essentials",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "validates Business Essentials login information",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "chooses forgot UserID",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "enter forgot UserID details",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "chooses forgot password",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "enter forgot password details",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "choose contact us",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "enter \"\u003ccustomer\u003e\" details on contact us page",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "browser close",
  "keyword": "And "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "city-national-bank-scenarios;customer-validates-login-information-for-different-suites;",
  "rows": [
    {
      "cells": [
        "customer"
      ],
      "line": 24,
      "id": "city-national-bank-scenarios;customer-validates-login-information-for-different-suites;;1"
    },
    {
      "cells": [
        "Hari"
      ],
      "line": 25,
      "id": "city-national-bank-scenarios;customer-validates-login-information-for-different-suites;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 25,
  "name": "Customer validates login information for different suites",
  "description": "",
  "id": "city-national-bank-scenarios;customer-validates-login-information-for-different-suites;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "he taps on signIn page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "choose to login City National Online",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "validates City National Online login information",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "moves to Business Suite",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "choose to login into Business Suite",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "validates Business Suite login information",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "moves to Business Essentials",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "choose to login into Business Essentials",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "validates Business Essentials login information",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "chooses forgot UserID",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "enter forgot UserID details",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "chooses forgot password",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "enter forgot password details",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "choose contact us",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "enter \"Hari\" details on contact us page",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "browser close",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 7884823908,
  "status": "passed"
});
formatter.match({
  "location": "CityNationalBankPageSteps.he_taps_on_signIn_page()"
});
formatter.result({
  "duration": 3331682859,
  "status": "passed"
});
formatter.match({
  "location": "CityNationalOnlinePageSteps.choose_to_login_City_National_Online()"
});
formatter.result({
  "duration": 1474040342,
  "status": "passed"
});
formatter.match({
  "location": "CityNationalOnlinePageSteps.validates_City_National_Online_login_information()"
});
formatter.result({
  "duration": 371950655,
  "status": "passed"
});
formatter.match({
  "location": "BusinessSuitePageSteps.moves_to_Business_Suite()"
});
formatter.result({
  "duration": 158196746,
  "status": "passed"
});
formatter.match({
  "location": "BusinessSuitePageSteps.choose_to_login_into_Business_Suite()"
});
formatter.result({
  "duration": 1141420875,
  "status": "passed"
});
formatter.match({
  "location": "BusinessSuitePageSteps.validates_Business_Suite_login_information()"
});
formatter.result({
  "duration": 479879079,
  "status": "passed"
});
formatter.match({
  "location": "BusinessEssentialsPageSteps.moves_to_Business_Essentials()"
});
formatter.result({
  "duration": 103023898,
  "status": "passed"
});
formatter.match({
  "location": "BusinessEssentialsPageSteps.choose_to_login_into_Business_Essentials()"
});
formatter.result({
  "duration": 273867910,
  "status": "passed"
});
formatter.match({
  "location": "BusinessEssentialsPageSteps.validates_Business_Essentials_login_information()"
});
formatter.result({
  "duration": 15265457,
  "status": "passed"
});
formatter.match({
  "location": "BusinessEssentialsPageSteps.chooses_forgot_UserID()"
});
formatter.result({
  "duration": 1278302041,
  "status": "passed"
});
formatter.match({
  "location": "ForgotUserIDPageSteps.enter_forgot_UserID_details()"
});
formatter.result({
  "duration": 2415026489,
  "status": "passed"
});
formatter.match({
  "location": "BusinessEssentialsPageSteps.chooses_forgot_password()"
});
formatter.result({
  "duration": 958281839,
  "status": "passed"
});
formatter.match({
  "location": "ForgotPasswordPageSteps.enter_forgot_password_details()"
});
formatter.result({
  "duration": 2146208991,
  "status": "passed"
});
formatter.match({
  "location": "BusinessEssentialsPageSteps.choose_contact_us()"
});
formatter.result({
  "duration": 465011760,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hari",
      "offset": 7
    }
  ],
  "location": "ContactUsPageSteps.enter_details_on_contact_us_page(String)"
});
formatter.result({
  "duration": 6001720232,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.browser_close()"
});
formatter.result({
  "duration": 270900022,
  "status": "passed"
});
});