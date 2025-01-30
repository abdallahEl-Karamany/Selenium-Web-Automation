package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    private void clickLink(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
    public LoginPage clickFormAuthentication(){
        clickLink("//a[text()='Form Authentication']");
        return new LoginPage(driver);
    }
    public ForgotPasswordPage clickForgotPassword(){
        clickLink("//a[text()='Forgot Password']");
        return new ForgotPasswordPage(driver);
    }

    public DropdownPage clickDropdown(){
        clickLink("//a[text()='Dropdown']");
        return new DropdownPage(driver);
    }


}
