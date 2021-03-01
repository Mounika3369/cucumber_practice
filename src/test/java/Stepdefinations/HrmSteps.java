package Stepdefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HrmSteps {
    LoginPageSteps obj=new LoginPageSteps();
    @Given("open the url")
    public void openTheUrl() {
        obj.enterUrl();
    }

    @When("Enter username and password")
    public void enterUsernameAndPassword() {
        obj.usrpwd();
        
    }

    @And("click on login button")
    public void clickOnLoginButton() {
        obj.loginbtn();
        
    }

    @Then("user should login successfully")
    public void userShouldLoginSuccessfully() {
        obj.login();
    }
}
