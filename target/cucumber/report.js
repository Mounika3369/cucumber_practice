$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Sample.feature");
formatter.feature({
  "line": 3,
  "name": "Sample",
  "description": "",
  "id": "sample",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@sample"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#  @login"
    },
    {
      "line": 6,
      "value": "#  Scenario: sample scenario"
    },
    {
      "line": 7,
      "value": "#    Given the user open application"
    },
    {
      "line": 8,
      "value": "#    When the user login to application"
    },
    {
      "line": 9,
      "value": "#    Then the user should able to see home page"
    },
    {
      "line": 10,
      "value": "#"
    },
    {
      "line": 11,
      "value": "#  @HomePageAdmin"
    },
    {
      "line": 12,
      "value": "#  Scenario Outline: home page"
    },
    {
      "line": 13,
      "value": "#    Given the user open application"
    },
    {
      "line": 14,
      "value": "#    When the user login to application"
    },
    {
      "line": 15,
      "value": "#    And the user should able to click home page tab \u003cName\u003e"
    },
    {
      "line": 16,
      "value": "#    Then the user should able to see form \u003cheader\u003e"
    },
    {
      "line": 17,
      "value": "#    Examples:"
    },
    {
      "line": 18,
      "value": "#      | Name  | header                        |"
    },
    {
      "line": 19,
      "value": "#      | Admin | Utilisateurs du système       |"
    },
    {
      "line": 20,
      "value": "#      | GIP   | Informations sur les employés |"
    }
  ],
  "line": 23,
  "name": "Login with valid user name and password",
  "description": "",
  "id": "sample;login-with-valid-user-name-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@Registration"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "open the Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "Enter the url",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "click on my account menu",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Enter register user id and password",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user must successfully login to the web page",
  "keyword": "Then "
});
formatter.match({
  "location": "SampleSteps.openTheBrowser()"
});
formatter.result({
  "duration": 17092179600,
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 85\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-DJ242TSR\u0027, ip: \u0027192.168.43.80\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: Backtrace:\n\tOrdinal0 [0x0145D383+3134339]\n\tOrdinal0 [0x0134A171+2007409]\n\tOrdinal0 [0x011EAEE8+569064]\n\tOrdinal0 [0x0117139F+70559]\n\tOrdinal0 [0x0116CC63+52323]\n\tOrdinal0 [0x01190DFC+200188]\n\tOrdinal0 [0x01190C1D+199709]\n\tOrdinal0 [0x0118EB0B+191243]\n\tOrdinal0 [0x01172E77+77431]\n\tOrdinal0 [0x01173E3E+81470]\n\tOrdinal0 [0x01173DC9+81353]\n\tOrdinal0 [0x01360CD9+2100441]\n\tGetHandleVerifier [0x015CB75A+1396954]\n\tGetHandleVerifier [0x015CB3D9+1396057]\n\tGetHandleVerifier [0x015D7126+1444518]\n\tGetHandleVerifier [0x015CBCE8+1398376]\n\tOrdinal0 [0x01357F51+2064209]\n\tOrdinal0 [0x013622EB+2106091]\n\tOrdinal0 [0x01362411+2106385]\n\tOrdinal0 [0x013749C4+2181572]\n\tBaseThreadInitThunk [0x752D0419+25]\n\tRtlGetAppContainerNamedObjectPath [0x7718662D+237]\n\tRtlGetAppContainerNamedObjectPath [0x771865FD+189]\n\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:126)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:499)\r\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:486)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:152)\r\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:464)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat steps.MySteps.openBrowser(MySteps.java:14)\r\n\tat stepDef.SampleSteps.openTheBrowser(SampleSteps.java:44)\r\n\tat ✽.Given open the Browser(Sample.feature:24)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "SampleSteps.enterTheUrl()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SampleSteps.clickOnMyAccountMenu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SampleSteps.enterRegisterUserIdAndPassword()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SampleSteps.clickOnLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SampleSteps.userMustSuccessfullyLoginToTheWebPage()"
});
formatter.result({
  "status": "skipped"
});
});