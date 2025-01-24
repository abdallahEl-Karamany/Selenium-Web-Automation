package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By formAuthentication= By.xpath("//a[text()='Form Authentication']");
    private By forgotPassword=By.xpath("//a[text()='Forgot Password']");
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public LoginPage clickFormAuthentication(){
        driver.findElement(formAuthentication).click();
        return new LoginPage(driver);
    }
    public ForgotPasswordPage clickForgotPassword(){
        driver.findElement(forgotPassword).click();
        return new ForgotPasswordPage(driver);
    }

}
