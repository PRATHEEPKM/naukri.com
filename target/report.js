$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feachers/Naukri.feature");
formatter.feature({
  "name": "NaukriTest",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "NaukriTest",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch the Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Naukristepdefinition.user_launch_the_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login in to Naukri",
  "keyword": "And "
});
formatter.match({
  "location": "Naukristepdefinition.user_login_in_to_Naukri()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the emailid",
  "keyword": "When "
});
formatter.match({
  "location": "Naukristepdefinition.user_enter_the_emailid()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the Password",
  "keyword": "And "
});
formatter.match({
  "location": "Naukristepdefinition.user_enter_the_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user login into",
  "keyword": "And "
});
formatter.match({
  "location": "Naukristepdefinition.the_user_login_into()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Search the job",
  "keyword": "When "
});
formatter.match({
  "location": "Naukristepdefinition.user_Search_the_job()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selecting the job",
  "keyword": "And "
});
formatter.match({
  "location": "Naukristepdefinition.user_selecting_the_job()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user get the details",
  "keyword": "Then "
});
formatter.match({
  "location": "Naukristepdefinition.user_get_the_details()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});