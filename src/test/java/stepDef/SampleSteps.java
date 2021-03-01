package stepDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import loginsteps.LoginSteps;
import pages.SamplePage;
import steps.MySteps;

public class SampleSteps {

    LoginSteps obj = new LoginSteps ();
    @Given("^the user open application$")
    public void theUserOpenApplication() {
       obj.openUrl();
    }

    @When("Enter first name")
    public void enterFirstName() {
        obj.firstname();
    }

    @And("Enter last name")
    public void enterLastName() {
        obj.lastname();
    }

    @And("Enter phone number")
    public void enterPhoneNumber() {
        obj.phoneNumber();
    }

    @And("Enter country name")
    public void enterCountryName() {
        obj.countryName();
    }

    @And("Enter city name")
    public void enterCityName() {
        obj.cityName();
    }

    @And("Enter Email address")
    public void enterEmailAddress() {
        obj.emailAddress();
    }

    @And("Select gender")
    public void selectGender() {
        obj.selectGender();
    }

    @And("Select check box")
    public void selectCheckBox() {
        obj.checkBox();
    }

    @And("Select drop down")
    public void selectDropDown() {
        obj.dropDown();
    }

    @And("Submit form")
    public void submitForm() {
        obj.submit();
    }

    @Then("validate for successful login")
    public void validateForSuccessfulLogin() {
        obj.validation();
    }

    @And("Enter email")
    public void enterEmail() {

    }


//    @When("the user login to application")
//    public void theUserLoginToApplication() {
//        sample.loginToApplication();
//    }
//
//    @Then("the user should able to see home page")
//    public void theUserShouldAbleToSeeHomePage() {
//        sample.verifyTitle();
//    }
//
//    @And("the user should able to click home page tab (.*)")
//    public void theUserShouldAbleToClickHomePageTabAdmin(String expValue) {
//        sample.userClicksOnHomePageTab(expValue);
//    }
//
//    @Then("the user should able to see form (.*)")
//    public void theUserShouldAbleToSeeFormHeader(String expHeader) {
//        sample.verifyHeaders(expHeader);
//    }
//
//     */
//
////    
//    
    
    
}
