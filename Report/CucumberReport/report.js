$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Booking functionality of Adactin \tApplication",
  "description": "",
  "id": "booking-functionality-of-adactin--application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Verify the user is able to login  the application",
  "description": "",
  "id": "booking-functionality-of-adactin--application;verify-the-user-is-able-to-login--the-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters the valid \"\u003cusername\u003e\" in the username field",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters valid \"\u003cpassword\u003e\" in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user verfies loginpage navigates to search hotel page",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "booking-functionality-of-adactin--application;verify-the-user-is-able-to-login--the-application;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "booking-functionality-of-adactin--application;verify-the-user-is-able-to-login--the-application;;1"
    },
    {
      "cells": [
        "AAA",
        "111"
      ],
      "line": 14,
      "id": "booking-functionality-of-adactin--application;verify-the-user-is-able-to-login--the-application;;2"
    },
    {
      "cells": [
        "BBB",
        "222"
      ],
      "line": 15,
      "id": "booking-functionality-of-adactin--application;verify-the-user-is-able-to-login--the-application;;3"
    },
    {
      "cells": [
        "prakashr",
        "673743"
      ],
      "line": 16,
      "id": "booking-functionality-of-adactin--application;verify-the-user-is-able-to-login--the-application;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1531400,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify the user is able to login  the application",
  "description": "",
  "id": "booking-functionality-of-adactin--application;verify-the-user-is-able-to-login--the-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters the valid \"AAA\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters valid \"111\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user verfies loginpage navigates to search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launches_the_application()"
});
formatter.result({
  "duration": 6516555800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AAA",
      "offset": 23
    }
  ],
  "location": "StepDefinition.user_enters_the_valid_in_the_username_field(String)"
});
formatter.result({
  "duration": 241633400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "111",
      "offset": 19
    }
  ],
  "location": "StepDefinition.user_enters_valid_in_the_password_field(String)"
});
formatter.result({
  "duration": 141363400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 567848100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verfies_loginpage_navigates_to_search_hotel_page()"
});
formatter.result({
  "duration": 23800,
  "status": "passed"
});
formatter.after({
  "duration": 108200,
  "status": "passed"
});
formatter.before({
  "duration": 143400,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Verify the user is able to login  the application",
  "description": "",
  "id": "booking-functionality-of-adactin--application;verify-the-user-is-able-to-login--the-application;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters the valid \"BBB\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters valid \"222\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user verfies loginpage navigates to search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launches_the_application()"
});
formatter.result({
  "duration": 385954100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BBB",
      "offset": 23
    }
  ],
  "location": "StepDefinition.user_enters_the_valid_in_the_username_field(String)"
});
formatter.result({
  "duration": 188650300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "222",
      "offset": 19
    }
  ],
  "location": "StepDefinition.user_enters_valid_in_the_password_field(String)"
});
formatter.result({
  "duration": 149228800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 650374600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verfies_loginpage_navigates_to_search_hotel_page()"
});
formatter.result({
  "duration": 60200,
  "status": "passed"
});
formatter.after({
  "duration": 357100,
  "status": "passed"
});
formatter.before({
  "duration": 233600,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verify the user is able to login  the application",
  "description": "",
  "id": "booking-functionality-of-adactin--application;verify-the-user-is-able-to-login--the-application;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters the valid \"prakashr\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters valid \"673743\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user verfies loginpage navigates to search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launches_the_application()"
});
formatter.result({
  "duration": 309844800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "prakashr",
      "offset": 23
    }
  ],
  "location": "StepDefinition.user_enters_the_valid_in_the_username_field(String)"
});
formatter.result({
  "duration": 207932600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "673743",
      "offset": 19
    }
  ],
  "location": "StepDefinition.user_enters_valid_in_the_password_field(String)"
});
formatter.result({
  "duration": 146443100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 4974246900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verfies_loginpage_navigates_to_search_hotel_page()"
});
formatter.result({
  "duration": 22900,
  "status": "passed"
});
formatter.after({
  "duration": 103700,
  "status": "passed"
});
});