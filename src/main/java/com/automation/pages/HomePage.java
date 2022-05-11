package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    WebElement woman;
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    WebElement dRESSES;
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    WebElement tSHIRTS;
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    WebElement signinLinks;
    @FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
    WebElement logolocatores;


    public void Verifywoman() {
        clickOnElement(woman);
    }

    public void VerifydRESSES() {
        clickOnElement(dRESSES);
    }

    public void VerifytSHIRTS() {
        clickOnElement(tSHIRTS);
    }

    public void verifyclickonsigninbutton() {
        clickOnElement(signinLinks);

    }

    public void verifylogopageclick() {
        clickOnElement(logolocatores);

    }

}