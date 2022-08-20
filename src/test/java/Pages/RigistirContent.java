package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RigistirContent extends Parent{
    public RigistirContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText="Register")
    private WebElement registerLink;

    @FindBy(id="customer.firstName")
    private WebElement firstName;

    @FindBy(id="customer.lastName")
    private WebElement lastName;

    @FindBy(id = "customer.address.street")
    private WebElement adress;

    @FindBy(id="customer.address.city")
    private WebElement city;

    @FindBy(id ="customer.address.state")
    private WebElement state;

    @FindBy(id="customer.address.zipCode")
    private WebElement zipCode;

    @FindBy(id= "customer.ssn")
    private WebElement SSN;

    @FindBy(id="customer.username")
    private WebElement userName;

    @FindBy(id="customer.password")
    private WebElement passWord;

    @FindBy(id="repeatedPassword")
    private WebElement confirm;

    @FindBy(xpath="(//input[@class='button'])[2]")
    private WebElement registerButton;

    @FindBy(css = "[id='rightPanel'] p")
    private WebElement success;

    @FindBy(css="[name='username']")
    private WebElement userName1;

    @FindBy(css="[name='password']")
    private WebElement passWord1;

    @FindBy(xpath="(//input[@class='button'])[1]")
    private WebElement loginButton;

    @FindBy(css = "[id='leftPanel'] b")
    private WebElement welcome;
WebElement myElement;
    public void findAndSend(String strElement, String value){
        switch (strElement)
        {
            case "firstName" : myElement =firstName; break;
            case "lastName" : myElement =lastName; break;
            case "adress" : myElement =adress; break;
            case "city" : myElement =city; break;
            case "state" : myElement =state; break;
            case "zipCode" : myElement =zipCode; break;
            case "SSN" : myElement =SSN; break;
            case "userName" : myElement =userName; break;
            case "passWord" : myElement =passWord; break;
            case "confirm" : myElement =confirm; break;
            case "userName1" : myElement =userName1; break;
            case "passWord1" : myElement = passWord1; break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "registerLink" : myElement =registerLink; break;
            case "registerButton" : myElement =registerButton; break;
            case "loginButton" : myElement =loginButton; break;

        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "success" : myElement =success; break;
            case "welcome" : myElement =welcome; break;
        }

        verifyContainsText(myElement,text);
    }

}
