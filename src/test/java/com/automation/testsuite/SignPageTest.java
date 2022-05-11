package com.automation.testsuite;

import com.automation.pages.*;
import com.automation.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignPageTest extends TestBase {
    AccountPage accountPage;
    HomePage homePage;
    ProductPage productPage;
    SignInPage signInPage;
    WomenCategoryPage womenCategoryPage;

    @BeforeMethod(alwaysRun = true)
    public void inIT() {
        accountPage = new AccountPage();
        homePage = new HomePage();
        productPage = new ProductPage();
        signInPage = new SignInPage();
        womenCategoryPage = new WomenCategoryPage();
    }

    @Test
    public void userShouldNavigateToSignInPageSuccessFully() {
        homePage.verifyclickonsigninbutton();
        signInPage.verifytextAuthentication();


    }

    @Test
    public void verifyTheErrorMessageWithInValidCredentials(
    ) {

        homePage.verifyclickonsigninbutton();
        signInPage.verifyemailfeildandsendtex("abcd@gmail.com");
        signInPage.verifypassswordfeildandsendtex("password");
        signInPage.verifyclickonSignbutton();

    }

}
