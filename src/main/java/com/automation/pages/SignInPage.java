package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//Email address, Password, Sign In Button, Create an account button and
//"AUTHENTICATION" text, "CREATE AN ACCOUNT" text Locators
//and create appropriate methods for it.
public class SignInPage extends Utility {

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement email;
    @FindBy(xpath = "//*[@id=\"passwd\"]")
    WebElement Password;
    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]")
    WebElement signInButton;
    @FindBy(xpath = "//button[@id='SubmitCreate']")
    WebElement createanaccountbutton;
    @FindBy(xpath = "//h3[contains(text(),'Create an account')]")
    WebElement creatanaccountText;
    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement authentication;
    @FindBy(xpath = "//p[contains(text(),'There is 1 error')]")
    WebElement errormessage;
    @FindBy(xpath = "//li[contains(text(),'Invalid email address.')]")
    WebElement errormessage1;
    @FindBy(xpath = "//li[contains(text(),'Password is required.')]")
    WebElement errormessagepassword;
    @FindBy(xpath = "//li[contains(text(),'Invalid email address.')]")
    WebElement errormessage3;
    @FindBy(xpath = "//li[contains(text(),'Authentication failed.')]")
    WebElement errormessage4;


    public void verifyemailfeildandsendtex(String str) {
        sendTextToElement(email, str);
    }

    public void verifypassswordfeildandsendtex(String str) {
        sendTextToElement(Password, str);
    }

    public void verifyclickonSignbutton() {
        clickOnElement(signInButton);
    }

    public void verifyclickonCreateNewAccount() {
        clickOnElement(createanaccountbutton);
    }

    public String verifytextAuthentication() {
        return getTextFromElement(authentication);
    }

    public String verifytextCreateanaccount() {
        return getTextFromElement(creatanaccountText);
    }

    public String verifytexterrormessage() {
        return getTextFromElement(errormessage);
    }

    public String verifytexterrormessage1() {
        return getTextFromElement(errormessage1);
    }

    public String verifytexterrormessagepassword() {
        return getTextFromElement(errormessagepassword);
    }

    public String verifytexterrormessage3() {
        return getTextFromElement(errormessage3);
    }

    public String verifytexterrormessage4() {
        return getTextFromElement(errormessage4);
    }




}