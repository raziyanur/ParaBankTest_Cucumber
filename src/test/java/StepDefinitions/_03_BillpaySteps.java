package StepDefinitions;
import Pages.ServersContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class _03_BillpaySteps {
    ServersContent sc=new ServersContent();
    @When("user click bill pay button and enter payee information")
    public void userClickBillPayButtonAndEnterPayeeInformation() {
        sc.findAndClick("billPay");
        sc.findAndSend("address","Kazakistan");
        sc.findAndSend("city","Almaty");
        sc.findAndSend("state","Almaty");
        sc.findAndSend("zipCode","05006");
        sc.findAndSend("phone","2529688");
        sc.findAndSend("account","123456");
        sc.findAndSend("verifayAccount","123456");
    }

    @Then("enter Payee Name as{string} Amount as {string}")
    public void enterPayeeNameAsAmountAs(String PayeeName, String Amount) {
        sc.findAndSend("payeeName",PayeeName);
        sc.findAndSend("amount",Amount);
        sc.findAndClick("sendPayment");
    }

    @And("bill payment should be completed")
    public void billPaymentShouldBeCompleted() {
        sc.findAndContainsText("complete","complete");
    }
}
