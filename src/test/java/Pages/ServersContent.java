package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServersContent extends Parent{
    public ServersContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Bill Pay")
    private WebElement billPay;

    @FindBy(css="[ng-model='payee.address.street']")
    private WebElement address;

    @FindBy(css ="[ng-model='payee.address.city']")
    private WebElement city;

    @FindBy(css="[ng-model='payee.address.state']")
    private WebElement state;

    @FindBy(css= "[ng-model='payee.address.zipCode']")
    private WebElement zipCode;

    @FindBy(css="[ng-model='payee.phoneNumber']")
    private WebElement phone;

    @FindBy(css="[ng-model='payee.accountNumber']")
    private WebElement account;

    @FindBy(css="[ng-model='verifyAccount']")
    private WebElement verifayAccount;

    @FindBy(css="[ng-model='payee.name']")
    private WebElement payeeName;

    @FindBy(css = "[ng-model='amount']")
    private WebElement amount;

    @FindBy(css="[value='Send Payment']")
    private WebElement sendPayment;

    @FindBy(css="[ng-show='showResult'] h1")
    private WebElement complete;
    WebElement myElement;
    public void findAndSend(String strElement, String value){
        switch (strElement)
        {
            case "address" : myElement =address; break;
            case "city" : myElement =city; break;
            case "state" : myElement =state; break;
            case "zipCode" : myElement =zipCode; break;
            case "phone" : myElement =phone; break;
            case "account" : myElement =account; break;
            case "verifayAccount" : myElement =verifayAccount; break;
            case "payeeName" : myElement =payeeName; break;
            case "amount" : myElement =amount; break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){

        switch (strElement)
        {
            case "billPay" : myElement =billPay; break;
            case "sendPayment" : myElement =sendPayment; break;


        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){

        switch (strElement)
        {
            case "complete" : myElement =complete; break;

        }

        verifyContainsText(myElement,text);
    }

}
