package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//WOMEN text, TOPS and DRESSES links, SortBy drop down, ProductsList Locators
//and create appropriate methods for it.
public class WomenCategoryPage extends Utility {

    public WomenCategoryPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = " @FindBy(xpath = \"//*[@id=\\\"block_top_menu\\\"]/ul/li[1]/a\")\n" +
            "    WebElement woman;")
    WebElement welcomewoman;
 @FindBy(xpath = " //*[@id=\"subcategories\"]/ul/li[1]/h5/a")
    WebElement topsmenu;
 @FindBy(xpath = "//*[@id=\"subcategories\"]/ul/li[2]/h5/a")
    WebElement dressesmenu;
 @FindBy(xpath = " //option[contains(text(),'--')]")
    WebElement shortby;
 @FindBy(xpath = "//*[@id=\"list\"]/a/i")
    WebElement shortbylist;




}
