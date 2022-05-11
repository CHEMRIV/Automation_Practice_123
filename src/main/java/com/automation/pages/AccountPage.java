package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends Utility {
   public AccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "input[@id='email_create']")
    WebElement emailid;
    @FindBy(xpath = "//h1[contains(text(),'Create an account')]")
    WebElement wellcomemessage;
    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement male;
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstname;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastname;
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwd;
    @FindBy(xpath = "//input[@id='newsletter']")
    WebElement newsletter;
    @FindBy(xpath = "//input[@id='optin']")
    WebElement offersclick;

    @FindBy(xpath = "//input[@id='firstname']")
    WebElement firstname1;

    @FindBy(xpath = "//input[@id='lastname']")
    WebElement lastname1;

    @FindBy(xpath = "//input[@id='company']")
    WebElement company;

    @FindBy(xpath = "//input[@id='address1']")
    WebElement address;
    @FindBy(xpath = "//input[@id='address2']")
    WebElement address2;
    @FindBy(xpath = "//input[@id='city']")
    WebElement city;
    @FindBy(tagName = "select")
    WebElement country;
    @FindBy(xpath = "//textarea[@id='other']")
    WebElement additionalinformation;
    @FindBy(xpath = "//input[@id='phone']")
    WebElement phonenum;
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobilenum;
    @FindBy(xpath = "//input[@id='alias']")
    WebElement futurereference;
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")
    WebElement registerbuttonclick;


}
