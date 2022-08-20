package StepDefinitions;

import Pages.RigistirContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_RigistirSteps {
    RigistirContent rc=new RigistirContent();


    @Given("Navigate to ParaSoft")
    public void navigateToParaSoft() {
        GWD.getDriver().get("https://parabank.parasoft.com/");
        GWD.getDriver().manage().window().maximize();

    }

    @When("click register link")
    public void clickRegisterLink() {
        rc.findAndClick("registerLink");
    }

    @And("Enter valid user information to form and click registir button")
    public void enterValidUserInformationToFormAndClickRegistirButton() {
        rc.findAndSend("firstName","razi");
        rc.findAndSend("lastName","mutlu");
        rc.findAndSend("adress","kazakistan");
        rc.findAndSend("city","almaty");
        rc.findAndSend("state","almaty");
        rc.findAndSend("zipCode","2322");
        rc.findAndSend("SSN","123456");
        rc.findAndSend("userName","grup6");
        rc.findAndSend("passWord","123456");
        rc.findAndSend("confirm","123456");
        rc.findAndClick("registerButton");
    }

    @Then("User should be register successfuly")
    public void userShouldBeRegisterSuccessfuly() {

        rc.findAndContainsText("success","success");
    }
}
