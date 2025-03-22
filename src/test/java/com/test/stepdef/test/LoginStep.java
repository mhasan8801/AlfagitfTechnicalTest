package com.test.stepdef.test;

import com.test.hooks.Hooks;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.test.LoginPage;
import pages.test.TestPage;

import java.io.IOException;

public class LoginStep {

    private final AndroidDriver<AndroidElement> driver;


    public LoginStep() throws IOException {
        super();
        this.driver = Hooks.driver;
    }

    @And("The user verify error message in Password field showed is {string}")
    public void errorInPassword(String error) throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertEquals(loginPage.errorInPassword(error),error);
    }

    @And("The user verify error message in Phone Number field showed is {string}")
    public void errorInPhoneNumber(String error) throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertEquals(loginPage.errorInPhoneNumber(error),error);
    }

    @And("The user verify already on Sign Up page")
    public void alreadyOnSignUpPage() throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.alreadyOnSignUpPage();
    }

    @And("The user verify login failed because member not active yet")
    public void loginFailedWithMemberNotActive() throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFailedWithAnotherAccount();
    }

    @And("The user verify login failed because device already connect with another account")
    public void loginFailedWithAnotherAccount() throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFailedWithAnotherAccount();
    }

    @And("The user verify already on Reset Password page")
    public void alreadyOnResetPasswordPage() throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.alreadyOnResetPasswordPage();
    }

    @And("On Login page, The user verify functionality hide password is {string}")
    public void verifyFunctionalityHidePassword(String password) throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertNotEquals(loginPage.verifyFunctionalityShowPassword(password),password);
    }

    @And("On Login page, The user verify functionality show password is {string}")
    public void verifyFunctionalityShowPassword(String password) throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertEquals(loginPage.verifyFunctionalityShowPassword(password),password);
    }

    @And("The user verify successfully login")
    public void verifySuccessfullyLogin() throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifySuccessfullyLogin();
    }

    @And("On Login page, The user click {string} label")
    public void clickLabelOnLogin(String btn) throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickButtonOnLogin(btn);
    }

    @And("On Login page, The user click {string} button")
    public void clickButtonOnLogin(String btn) throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickButtonOnLogin(btn);
    }

    @And("On Login page, The user input {string} as Password")
    public void inputPassword(String password) throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputPassword(password);
    }

    @And("On Login page, The user input {string} as Phone Number")
    public void inputPhoneNumber(String phoneNumber) throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputPhoneNumber(phoneNumber);
    }

    @When("On Main page, The user click {string} button")
    public void clickButtonOnMain(String btn) throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickButtonOnMain(btn);
    }

    @Given("The user open Alfagift App")
    public void openApp() throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openAlfagift();
    }

}
