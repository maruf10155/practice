$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/test.feature");
formatter.feature({
  "name": "test feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "testing feature",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "given name is \"\u003cname\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "password is \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "print all",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "password"
      ]
    },
    {
      "cells": [
        "qwe",
        "123"
      ]
    },
    {
      "cells": [
        "asd",
        "4568963"
      ]
    },
    {
      "cells": [
        "zxc",
        "789"
      ]
    }
  ]
});
formatter.scenario({
  "name": "testing feature",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "given name is \"qwe\"",
  "keyword": "Given "
});
formatter.match({
  "location": "step.test.given_name_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "password is \"123\"",
  "keyword": "When "
});
formatter.match({
  "location": "step.test.password_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "print all",
  "keyword": "Then "
});
formatter.match({
  "location": "step.test.print_all()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "testing feature",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "given name is \"asd\"",
  "keyword": "Given "
});
formatter.match({
  "location": "step.test.given_name_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "password is \"4568963\"",
  "keyword": "When "
});
formatter.match({
  "location": "step.test.password_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "print all",
  "keyword": "Then "
});
formatter.match({
  "location": "step.test.print_all()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "testing feature",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "given name is \"zxc\"",
  "keyword": "Given "
});
formatter.match({
  "location": "step.test.given_name_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "password is \"789\"",
  "keyword": "When "
});
formatter.match({
  "location": "step.test.password_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "print all",
  "keyword": "Then "
});
formatter.match({
  "location": "step.test.print_all()"
});
formatter.result({
  "status": "passed"
});
});