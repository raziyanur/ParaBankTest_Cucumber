package StepDefinitions;

import Pages.RigistirContent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_LoginSteps {
    RigistirContent rc=new RigistirContent();



    @When("Enter username as {string} and password as {string} and click login button")
    public void enterUsernameAsAndPasswordAsAndClickLoginButton(String username, String password) {
    rc.findAndSend("userName1",username);
    rc.findAndSend("passWord1",password);
    rc.findAndClick("loginButton");

    }

    @Then("User should login successfuly")
    public void userShouldLoginSuccessfuly() {
        rc.findAndContainsText("welcome","welcome");
    }

    @Then("User should login unsuccessfuly")
    public void userShouldLoginUnsuccessfuly() {
        rc.findAndContainsText("success","error");
    }
}
