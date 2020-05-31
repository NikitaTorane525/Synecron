$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/ratesapiValidations.feature");
formatter.feature({
  "name": "Validating place API\u0027s",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "\tVerify if the Rates API for specific date foreign exchange rates works fine ",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ratesapi"
    }
  ]
});
formatter.step({
  "name": "Rates API",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinations.StepDefination.rates_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"ratesapi\" with \"get\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinations.StepDefination.user_calls_with_http_request(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat stepdefinations.StepDefination.user_calls_with_http_request(StepDefination.java:41)\r\n\tat ✽.user calls \"ratesapi\" with \"get\" http request(file:///C:/OCP/JAVA/java-developer/Cucumber_Framework_Sync/src/test/java/features/ratesapiValidations.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the Api call is success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinations.StepDefination.the_Api_call_is_success_with_status_code(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "\"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.StepDefination.in_response_body_is(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "\"base\" in response body is \"EUR\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.StepDefination.in_response_body_is(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "\"date\" in response body is \"2010-01-11\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.StepDefination.in_response_body_is(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
});