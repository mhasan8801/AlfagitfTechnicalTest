package pages.test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

public class LoginPage extends BasePage {

    @AndroidFindBy(xpath = "//*[@text='Akun']")
    private MobileElement accountMenu;

    @AndroidFindBy(xpath = "//*[@text='Beranda']")
    private MobileElement berandaMenu;

    @AndroidFindBy(xpath = "//*[@text='Belanja']")
    private MobileElement belanjaMenu;

    @AndroidFindBy(xpath = "//*[@text='Keluar']")
    private MobileElement logOutButton;

    @AndroidFindBy(xpath = "//*[@text='Ya']")
    private MobileElement yesButton;

    @AndroidFindBy(xpath = "//*[@text='LUPA PASSWORD']")
    private MobileElement forgotPasswordLabel;

    @AndroidFindBy(xpath = "//*[@text='Login Gagal']")
    private MobileElement loginFailedLabel;

    @AndroidFindBy(xpath = "//*[@text='Hubungi Sahabat Alfamart']")
    private MobileElement contactAlfarmartLabel;

    @AndroidFindBy(xpath = "//*[@text='Daftar']")
    private MobileElement sigUpLabel;

    @AndroidFindBy(xpath = "//*[@text='Masukkan nomor HP atau nomor Ponta Anda untuk registrasi aplikasi Alfagift']")
    private MobileElement inputPhoneNumberLabel;

    @AndroidFindBy(id = "com.alfamart.alfagift:id/et_phone")
    private MobileElement phoneNumberMemberField;

    @AndroidFindBy(id = "com.alfamart.alfagift:id/et_password")
    private MobileElement passwordField;

    @AndroidFindBy(id = "com.alfamart.alfagift:id/text_input_end_icon")
    private MobileElement showHidePassword;

    @AndroidFindBy(id = "com.alfamart.alfagift:id/etEmailOrPhone")
    private MobileElement emailOrPhoneFieldInResetPassword;

    @AndroidFindBy(id = "com.alfamart.alfagift:id/btnNext")
    private MobileElement nextButtonInResetPassword;

    @AndroidFindBy(xpath = "(//*[@resource-id=\"com.alfamart.alfagift:id/tv_info\"])[1]")
    private MobileElement errorMessageInPhoneNumberField;

    @AndroidFindBy(xpath = "//*[@resource-id='com.alfamart.alfagift:id/error_password_view']/*[@resource-id='com.alfamart.alfagift:id/tv_info']\n")
    private MobileElement errorMessageInPasswordField;

    public LoginPage(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    public String errorInPassword(String error){
        return errorMessageInPasswordField.getText();
    }

    public String errorInPhoneNumber(String error){
        return errorMessageInPhoneNumberField.getText();
    }

    public void alreadyOnSignUpPage(){
        sigUpLabel.isDisplayed();
        inputPhoneNumberLabel.isDisplayed();
    }

    public void loginFailedWithAnotherAccount(){
        loginFailedLabel.isDisplayed();
        contactAlfarmartLabel.isDisplayed();
    }

    public void alreadyOnResetPasswordPage(){
        forgotPasswordLabel.isDisplayed();
        emailOrPhoneFieldInResetPassword.isDisplayed();
        nextButtonInResetPassword.isDisplayed();
    }

    public String verifyFunctionalityShowPassword(String password){
        click(showHidePassword);
        return passwordField.getText();
    }

    public void verifySuccessfullyLogin(){
        berandaMenu.isDisplayed();
        belanjaMenu.isDisplayed();
    }

    public void inputPassword(String password){
        sendKeys(passwordField,password);
    }

    public void inputPhoneNumber(String phoneNumber){
        sendKeys(phoneNumberMemberField,phoneNumber);
    }

    public void clickButtonOnLogin(String btn) throws Exception {
        clickByText(btn);
    }

    public void clickButtonOnMain(String btn) throws Exception {
        clickByText(btn);
    }

    public void openAlfagift() throws Exception {
        driver.closeApp();
        driver.launchApp();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        try{
            wait.until(ExpectedConditions.visibilityOf(accountMenu));
            click(accountMenu);
            scrollToElement(logOutButton,"up");
            click(logOutButton);
            click(yesButton);
        } catch (Exception e) {
            System.out.println("Already logout");
        }
    }

}
